package application;
import java.util.Scanner;

import entities.Rent;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("How many rooms will be rented?");
        int n = in.nextInt();

        Rent [] vect = new Rent[10];

         for (int i = 0; i < n; i++) {
            
            System.out.println("Rent #" + (i + 1));
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("E-mail: ");
            String email = in.next();
            System.out.print("Room: ");
            int roomNumber = in.nextInt();
            vect [roomNumber] = new Rent (name, email);
            
        }

        System.out.println();
        System.out.println("Busy rooms: ");

         for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }


        in.close();
    }

}
