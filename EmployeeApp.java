package EmployeeDBApp.lib;


import java.sql.*;
import java.util.Scanner;

public class EmployeeApp {

    static final String DB_URL = "jdbc:mysql://localhost:3306/EmployeeDB"; 
    static final String USER = "root"; 
    static final String PASS = "Sneha17";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Manually load the driver (required for Connector/J 9.3.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to MySQL!");

            while (true) {
                System.out.println("\n----- Employee Menu -----");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Designation: ");
                        String designation = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();
                        addEmployee(conn, name, designation, salary);
                        break;

                    case 2:
                        viewEmployees(conn);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to Update: ");
                        int id = sc.nextInt();
                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();
                        updateSalary(conn, id, newSalary);
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to Delete: ");
                        int delId = sc.nextInt();
                        deleteEmployee(conn, delId);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        conn.close();
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection conn, String name, String designation, double salary) throws SQLException {
        String sql = "INSERT INTO Employee (name, designation, salary) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, designation);
            stmt.setDouble(3, salary);
            stmt.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nID | Name | Designation | Salary");
            System.out.println("------------------------------------------");

            while (rs.next()) {
                System.out.printf("%d | %s | %s | %.2f\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getDouble("salary"));
            }
        }
    }

    static void updateSalary(Connection conn, int id, double newSalary) throws SQLException {
        String sql = "UPDATE Employee SET salary = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, newSalary);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Salary updated.");
            else
                System.out.println("Employee not found.");
        }
    }

    static void deleteEmployee(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM Employee WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Employee deleted.");
            else
                System.out.println("Employee not found.");
        }
    }
}
