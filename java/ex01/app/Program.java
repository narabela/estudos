package app;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = in.nextDouble();
        rectangle.height = in.nextDouble();

        rectangle.calcularArea();
        rectangle.calcularPerimetro();
        rectangle.calcularDiagonal();

        System.out.println("Area: " + rectangle);

        in.close();
    }
}