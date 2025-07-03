# Internship Projects – Sneha Dhir

This repository contains Java-based projects developed during the **Elevate Labs Internship Program**.

---

## Projects Included

---

### [Calculator (Java Console-Based)](./Calculator/)

#### Objective:
To build a basic Java program that functions as a calculator using the command-line interface.

#### What I Did:
- Developed a console-based calculator in Java.
- Used `Scanner` to accept input from the user.
- Implemented arithmetic operations using `switch` statements.
- Created a loop-based menu that continues until the user exits.

#### Features:
- Supports **Addition, Subtraction, Multiplication, and Division**.
- Menu-driven interface for ease of use.
- Displays results and prompts clearly.
- Handles invalid inputs and divide-by-zero errors (enhanced version).

#### Technologies Used:
- Java (Core)
- Scanner for input
- Control structures (loops, switch-case)

#### Learning Outcomes:
- Practiced writing clean, modular Java code.
- Strengthened understanding of loops, conditions, and input/output in Java.
- Improved skills in building interactive console applications.

---

###  [Student Record Management System (CLI)](./StudentRecordSystem/)

####  Objective:
To simulate a basic record management system that allows CRUD operations on student data using Java OOP and CLI.

#### What I Did:
- Created a `Student` class with attributes: roll number, name, age, and course.
- Wrote a main class `StudentRecordManagement` to manage the logic.
- Implemented a **menu-based CLI** using loops and `Scanner`.
- Used `ArrayList` to store student objects dynamically.
- Ensured roll number uniqueness and provided feedback for all operations.

#### Features:
- Add new student records.
- View all students and display total count.
- Update existing records by roll number.
- Delete student records.
- Validates duplicate roll numbers.
- Clean and user-friendly output format.

####  Technologies Used:
- Java (OOP concepts: classes, objects, encapsulation)
- ArrayList for dynamic storage
- Scanner for input
- Loops and conditional logic

#### Learning Outcomes:
- Learned to build CRUD-based applications using Java.
- Practiced object-oriented programming.
- Understood how in-memory data storage can simulate databases.
- Improved input handling, validation, and error feedback.

---

### [Library Management System (CLI – Java)](./LibraryManagementSystem/)

A Java-based system to manage books and users from the command line.

 Source File: `LibraryManagementSystem/LibraryManagementSystem.java`  
 [Library System README](./LibraryManagementSystem/README.md)

#### Objective  
To build a simple command-line Java application that manages books and users using Object-Oriented Programming.

---

#### What I Did
- Created core classes: `Book`, `User`, and `LibraryManagementSystem`.
- Used basic `for` loops to iterate through `ArrayList`s.
- Implemented features to add books/users, issue and return books, and view all records.
- Managed the state of books (issued or not) with proper validations.
- Ensured smooth terminal-based interaction with clear prompts.

---

#### Features
-  **Add Book** – Add a new book with ID and title.
-  **Add User** – Register a new user with unique ID and name.
-  **Issue Book** – Issue a book if it is not already issued.
-  **Return Book** – Return a previously issued book.
-  **View All Books** – Display a list of all books with issue status.
-  **Validation** – Handles invalid IDs, duplicate issues/returns.

---

#### Technologies Used
- Java (OOP: Classes, Objects, Encapsulation)
- `ArrayList` for dynamic data storage
- `Scanner` for user input
- Loops and conditionals for program flow

---

#### Learning Outcomes
- Gained hands-on experience in **object modeling** for real-life systems.
- Practiced building CLI-based CRUD functionality in Java.
- Improved skills in class design, data handling, and user input management.
- Understood in-memory logic for record-keeping (like a mini database).

---

### [Notes App – File I/O (Java CLI)](./NotesApp/)

A simple text-based notes manager that lets users write and view notes using file handling in Java.

📄 Source File: `NotesApp/NotesApp.java`  
📝 [Notes App README](./NotesApp/README.md)

---

#### Objective  
To create a command-line Java application that manages user notes using **FileWriter** and **FileReader** for permanent storage.

---

#### What I Did
- Developed a Java CLI app that saves user-written notes to a `.txt` file.
- Implemented features to write a new note or view all saved notes.
- Used `FileWriter` in append mode to preserve notes.
- Used `FileReader` and `BufferedReader` to display all previous notes line-by-line.
- Handled file-not-found and I/O exceptions gracefully.

---

#### Features
-  **Write a Note** – User can write a note which is saved to `notes.txt`.
-  **View Notes** – Reads and displays all saved notes.
-  **Error Handling** – Proper messages if file doesn't exist or fails to write.
-  **Persistent Storage** – Notes are not lost after program ends.

---

#### Technologies Used
- Java Core
- `FileWriter` for writing notes
- `BufferedReader` & `FileReader` for reading notes
- `Scanner` for user input
- Loops and conditional logic

---

#### Learning Outcomes
- Learned how to work with files in Java using Reader/Writer classes.
- Understood the concept of persistent storage vs. in-memory data.
- Practiced building a real-world utility using core Java.
- Gained confidence in exception handling for file operations.

---
# Bank Account Simulation – Java OOP Project

## Objective
Simulate basic bank operations such as deposit, withdrawal, balance inquiry, and transaction history using **Object-Oriented Programming** in Java.

## Tools & Technologies
- Language: Java
- IDE: VS Code
- Execution: Terminal / Command Prompt

---

## Features
- Class-based structure using OOP principles
- Account creation with:
  - Deposit
  - Withdraw
  - View Balance
  - View Transaction History
- Uses basic `for` loops (not enhanced loops)
- Clean, beginner-friendly code with proper user input handling

---

## Files
- `BankAccount.java` – Main Java program
- `README.md` – Project documentation

---

## How to Run

1. Open terminal in the folder where the file is saved.
2. Compile the program:
   ```bash
   javac BankAccount.java

# Java GUI – ToDo App

This is a simple **To-Do List Application** built using **Java Swing**. It allows users to add and delete tasks from a graphical interface.

---

## Objective

Build a basic desktop GUI app in Java that helps users manage their daily tasks with a to-do list interface.

---

## Tools & Technologies

- **Programming Language**: Java  
- **GUI Library**: Java Swing (built-in)  
- **IDE Used**: IntelliJ IDEA Community Edition / Eclipse

---

## Features

- Add new tasks  
- Delete selected tasks  
- Scroll through all tasks  
- Simple, clean layout

---

## Preview

![ToDo App Screenshot](https://via.placeholder.com/400x300.png?text=ToDo+App+Screenshot)

---

## How to Run

1. Open your Java IDE (IntelliJ / Eclipse).
2. Create a new Java Project.
3. Create a file named `ToDoApp.java`.
4. Copy and paste the Java code from the [ToDoApp.java](./ToDoApp.java) file.
5. Run the `main()` method.
6. Use the GUI window to:
   - Type a task in the input box.
   - Click `Add Task` to add it.
   - Select a task and click `Delete Task` to remove it.

---
# Employee Database App – Java + MySQL + JDBC

A simple Java console application that performs **CRUD operations** (Create, Read, Update, Delete) on an employee database using **JDBC** and **MySQL**.

---

## Objective

- Connect Java to MySQL using JDBC.
- Perform database operations like:
  - Add new employee
  - View all employees
  - Update employee salary
  - Delete employee record

---

## Tools & Technologies

- Java (JDK 17+)
- MySQL Server
- MySQL Workbench (optional)
- JDBC Driver (mysql-connector-j-9.3.0.jar)
- VS Code or any Java IDE
- Windows Command Prompt / PowerShell

---

**Sneha Dhir**  
B.Tech – Computer Science (AIML) 
UPES Dehradun  
Internship
---
