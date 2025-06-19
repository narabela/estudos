package app;

import controller.Calculadora;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros:");
        int option = in.nextInt();
        Calculadora calculadora = new Calculadora();
        int n1;
        int n2;
        int n3;

        switch (option) {
            case 2:
                System.out.println("Digite 2 numeros");
                n1 = in.nextInt();
                n2 = in.nextInt();
                System.out.println("A soma dos dois numeros é: " + calculadora.calcular(n1, n2));
                break;
            case 3:
                System.out.println("Digite 3 numeros");
                n1 = in.nextInt();
                n2 = in.nextInt();
                n3 = in.nextInt();
                System.out.println("A soma dos três numeros é " + calculadora.calcular(n1, n2, n3));
                break;

            case 4:
                System.out.println("Digite 4 numeros");
                n1 = in.nextInt();
                n2 = in.nextInt();
                n3 = in.nextInt();
                int n4 = in.nextInt();
                System.out.println("A soma dos quatro numeros é: " + calculadora.calcular(n1, n2, n3, n4));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        in.close();

    }
}
