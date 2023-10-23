/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot14;

/**
 *
 * @author Phuong
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String code;
    private String name;
    private double salary;

    public Employee(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Salary: " + salary;
    }
}

