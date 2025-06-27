import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp{
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "Notes.txt";

    public static void main(String[] args){
        int choice;

        do{
            //MENU
            System.out.println("\n Nots Application");
            System.out.println("1. Write a new Note.");
            System.out.println("2. View all Notes.");
            System.out.println("3. Exit.");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            //Menu logic
            if(choice == 1){
                WriteNote();
            }else if(choice==2){
                ViewNotes();
            }
            else if(choice==3){
                System.out.println("Thank You! You are Exiting the app.");
            }else{
                System.out.println("Invalid Choice!");            
            }
        }while(choice!=3);
    }
    // Write a note to the file.
    static void WriteNote(){
        System.out.println("Write your note: ");
        String note = sc.nextLine();

        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(note+ "\n");
            fw.close();
            System.out.println("Note saved successfully.");
        }catch(IOException e){
            System.out.println("Error saving the note.");
        }
    }
    // Read and display the notes from the File.
    static void ViewNotes(){
        System.out.println("\n Your Notes: ");
        try{
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);

            String line;
            boolean empty = true;
            while((line=br.readLine())!=null){
                System.out.println("- "+line);
                empty = false;
            }
            if(empty){
                System.out.println("No Notes found please add one.");
            }
            br.close();
            fr.close();
        }catch(IOException e){
            System.out.println("No Notes file found. Write a note first.");
        }
    }
}