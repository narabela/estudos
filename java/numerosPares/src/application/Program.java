package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);

        System.out.println("Insira a quantidade de numeros a serem digitados: ");
        int n = in.nextInt();
        int vetor [] = new int [n];
        in.nextLine();

        System.out.println("Digite os numeros: ");
        for (int i=0; i< vetor.length; i++){
            vetor [i] = in.nextInt();
        }
        
        System.out.println("Numeros pares: ");
        for (int i=0; i< vetor.length; i++){
            if (vetor[i]%2 ==0 ){
                System.out.println(vetor[i]);
            }
        }

        in.close();

    }
}
