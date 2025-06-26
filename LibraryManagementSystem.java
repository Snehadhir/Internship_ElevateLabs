import java.util.*;

class Book{
    private int id;
    private String title;
    private boolean isIssued;

    public Book(int id, String title){
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isIssued(){
        return isIssued;
    }
    public void issue(){
        isIssued = true;
    }
    public void returned(){
        isIssued = false;
    }
}
// User class to represnt a library user.
class User{
    private int userId;
    private String name;

    public User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public int getUserID(){
        return userId;
    }
    public String getName(){
        return name;
    }
}
//MAin class
public class LibraryManagementSystem{
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args){

        int choice;
        do{
            System.out.println("\n Library Management System ");
            System.out.println("1) Add Book");
            System.out.println("2) Add User");
            System.out.println("3) Issue Book");
            System.out.println("4) Return Book");
            System.out.println("5) View all Books");
            System.out.println("6) Exit..");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: addBook(); break;
                case 2: addUser(); break;
                case 3: issueBook(); break;
                case 4: returnBook(); break;
                case 5: viewBooks(); break;
                case 6: System.out.println("Exiting.. ");
                defaut: System.out.println("Invalid choice");
            }
        }while(choice!=6);
    }
    //Add a new book
    private static void addBook(){
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        books.add(new Book(id,title));
        System.out.println("Book added!");
    }
    //Add a new User.
    private static void addUser(){
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        users.add(new User(id,name));
        System.out.println("User Added!");
    }
    //Issue a book to a user.
    private static void issueBook(){
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();
        boolean found = false;

        for(int i=0;i<books.size();i++){
            Book b = books.get(i);
            if(b.getId()==id){
                found = true;
                if(!b.isIssued()){
                    b.issue();
                    System.out.println("Book issued Successfully.");
                }else{
                    System.out.println("Book is already issued.");
                }
                break;
            }
        }
        if(!found){
            System.out.println("Book not found!");
        }
    }
    //Return a book
    private static void returnBook(){
        System.out.print("Enter book ID to return: ");
        int id = sc.nextInt();
        boolean found = false;

        for(int i=0;i<books.size();i++){
            Book b = books.get(i);
            if(b.getId()==id){
                found = true;
                if(b.isIssued()){
                    b.returned();
                    System.out.println("Book returned Successfully.");
                }else{
                    System.out.println("Book was not issued.");
                }break;
            }
        }
        if(!found){
            System.out.println("Book was not found.");
        }
    }
    //Display list of all books
    private static void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books in library.");
        }else{
            System.out.println("\n Book list: ");
            for(int i=0;i<books.size();i++){
                Book b = books.get(i);
                System.out.println("ID: "+b.getId()+
                                   " | Title: "+b.getTitle()+
                                   " | Issued: "+ (b.isIssued() ?" yes" : "No"));
            }
        }
    }
}