package app;

import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = in.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary = in.nextDouble();
        System.out.println("Tax: ");
        employee.tax = in.nextDouble();

        employee.netSalary();
        System.out.println("Employee: " + employee.name + ", $ "+ employee.netSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = in.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        in.close();
    }
}