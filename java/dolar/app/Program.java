package app;

import java.util.Scanner;
import utilitario.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("What is the dolar price: ");
        double dollar = in.nextDouble();
        System.out.println("How many dollars will be bought? ");
        int quantity = in.nextInt();

        double reais = CurrencyConverter.converter(dollar, quantity);

        System.out.println("Amount to be paid in reais: " + reais);

        in.close();      

    }

}
