package app;

import java.util.Scanner;
import entities.Person;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas pessoas serão inseridas? ");
        int n = in.nextInt();
        Person[] vect = new Person[n];

        System.out.println("Digite nome, idade e altura, nessa respectiva ordem:");

        for (int i = 0; i < vect.length; i++) {
            in.nextLine();
            String name = in.nextLine();
            int age = in.nextInt();
            double height = in.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        double sumtotal = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sumtotal += vect[i].getHeight();
        }
        double avg = sumtotal / vect.length;
        System.out.println("Altura média: " + avg);

        int menores = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menores++;
            }
        }
        double pct_menores = (menores * 100) / vect.length;
        System.out.println("Pessoas com menos de 16 anos: " + pct_menores + "%");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

    }

}
