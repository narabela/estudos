package app;

import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the grades: ");
        student.grade1 = in.nextDouble();
        student.grade2 = in.nextDouble();
        student.grade3 = in.nextDouble();

        student.calcularMedia();

        System.out.println("FINAL GRADE: " + student.calcularMedia());

        student.aprovacao();


        in.close();
    }
}