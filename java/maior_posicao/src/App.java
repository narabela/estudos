import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Insira a quantidade de numeros a serem digitados: ");
        int n = in.nextInt();
        int vetor [] = new int [n];
        
        int maior = vetor [0];
        int indiceMaior = 0;

        in.nextLine();

        System.out.println("Digite o numero: ");
        for (int i=0; i< vetor.length; i++){
            vetor [i] = in.nextInt();
        }

        for (int i=0; i<vetor.length; i++){
            if (vetor[i]> maior){
                maior = vetor [i];
                indiceMaior = i;

            }
        }
        System.out.println("");

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + indiceMaior);

        in.close();
    }
}
