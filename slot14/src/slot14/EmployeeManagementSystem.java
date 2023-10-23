/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Phuong
 */
public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadEmployeesFromFile();

        while (true) {
            System.out.println("Employee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Promote Employee");
            System.out.println("4. List Employees");
            System.out.println("5. Save to File");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    promoteEmployee();
                    break;
                case 4:
                    listEmployees();
                    break;
                case 5:
                    saveEmployeesToFile();
                    break;
                case 6:
                    saveEmployeesToFile();
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void loadEmployeesFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String code = parts[0].trim();
                    String name = parts[1].trim();
                    double salary = Double.parseDouble(parts[2].trim());
                    Employee employee = new Employee(code, name, salary);
                    employees.add(employee);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading employees from file: " + e.getMessage());
        }
    }

    private static void addEmployee() {
        System.out.print("Enter employee code: ");
        String code = scanner.nextLine();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee employee = new Employee(code, name, salary);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee() {
        System.out.print("Enter the employee code to remove: ");
        String code = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getCode().equalsIgnoreCase(code)) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }

        System.out.println("Employee with code " + code + " not found.");
    }

    private static void promoteEmployee() {
        System.out.print("Enter the employee code to promote: ");
        String code = scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getCode().equalsIgnoreCase(code)) {
                System.out.print("Enter the new salary: ");
                double newSalary = scanner.nextDouble();
                scanner.nextLine();
                employee.setSalary(newSalary);
                System.out.println("Employee promoted successfully.");
                return;
            }
        }

        System.out.println("Employee with code " + code + " not found.");
    }

    private static void listEmployees() {
        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void saveEmployeesToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"));
            for (Employee employee : employees) {
                writer.write(employee.getCode() + ", " + employee.getName() + ", " + employee.getSalary());
                writer.newLine();
            }
            writer.close();
            System.out.println("Employees saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving employees to file: " + e.getMessage());
        }
    }
}
