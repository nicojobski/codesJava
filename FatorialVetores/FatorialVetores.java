/**
 *
 * @author Nico Jobski Andrade  
 */
import java.util.Scanner;

public class FatorialVetores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = s.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            B[i] = calcularFatorial(A[i]);
        }
        
        System.out.println("\nVetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B (fatoriais):");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }

        s.close();
    }

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
