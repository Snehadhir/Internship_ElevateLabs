import java.util.*;

class Student{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void display(){
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("----------------------------------");
    }
}
public class StudentRecordManagement{
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\n STUDENT MANAGEMENT SYSTEM ");
            System.out.println("1) Add Student ");
            System.out.println("2) View Student ");
            System.out.println("3) Update Student ");
            System.out.println("4) Delete Student ");
            System.out.println("5) Exit ");
            System.out.println("Enter your choice (1-5) : ");
            choice  = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1-> addStudent();
                case 2 -> viewStudent();
                case 3 -> UpdateStudent();
                case 4 -> DeleteStudent();
                case 5 -> System.out.println("Exiting program....");
                default -> System.out.println("Invalid choice. Plese select between 1 to 5.");
            }
        }while (choice!=5);
    }
    private static boolean isRollNoExists(int rollNo){
        for(Student s : students){
            if(s.getRollNo()==rollNo){
                return true;
            }
        }
        return false;
    }
    private static void addStudent(){
        System.out.print("Enter Roll NO.: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        if(isRollNoExists(rollNo)){
            System.out.println("Roll Number Already Exists. Cannot add duplicate.");
            return;
        }
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter course: ");
        String course = sc.nextLine();

        students.add(new Student(rollNo, name, age, course));
        System.out.println("Student added successfully.");
    }
    private static void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No student record found!");
        }else{
            System.out.println("\n Total Students: "+students.size());
            for(Student s: students){
                s.display();
            }
        }
    }
    private static void UpdateStudent(){
        System.out.print("Enter Roll number of stdent to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student found = null;
        for(Student s: students){
            if(s.getRollNo()==rollNo){
                found = s;
                break;
            }
        }
        if(found!=null){
            System.out.print("Enter new Name: ");
            found.SetName(sc.nextLine());

            System.out.print("Enter your age: ");
            found.setAge(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter new Course: ");
            found.setCourse(sc.nextLine());
            
            System.out.println("Student Record updated!!");
        }else{
            System.out.println("Student not found!!");
        }
    }
    private static void DeleteStudent(){
        System.out.println("Enter Roll No of student ot get delete.");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student toRemove = null;
        for(Student s: students){
            if(s.getRollNo()==rollNo){
                toRemove= s;
                break;
            }
        }
        if(toRemove!=null){
            students.remove(toRemove);
            System.out.println("Student deleted successfully.");
        }else{
            System.out.println("Student not found.");
        }
    }
}
