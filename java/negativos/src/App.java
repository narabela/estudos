
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros do vetor: ");
        int n = in.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }

        System.out.println("Negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }

        }

    }
}
