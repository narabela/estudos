
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        double sum = 0;

        System.out.println("Digite a quantidade de numeros do vetor: ");
        int n = in.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
            sum += vetor[i];
        }

        double avg = sum / vetor.length;

        System.err.println("Valores: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("SOMA: " + sum);
        System.out.println("MEDIA: " + avg);
        in.close();

    }
}
