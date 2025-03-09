import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */
public class SomaVetoresInvertido {
    
    public static int[] somarVetoresInverso(int[] vetorA, int[] vetorB) {
        int N = vetorA.length;
        int[] vetorResultado = new int[N];

        for (int i = 0; i < N; i++) {
            vetorResultado[N - 1 - i] = vetorA[i] + vetorB[i];
        }

        return vetorResultado;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o tamanho dos vetores: ");
        int N = s.nextInt();
        
        int[] vetorA = new int[N];
        int[] vetorB = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            vetorA[i] = s.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            vetorB[i] = s.nextInt();
        }

        int[] vetorResultado = somarVetoresInverso(vetorA, vetorB);

        System.out.println("Vetor Resultado:");
        for (int num : vetorResultado) {
            System.out.print(num + " ");
        }

        s.close();
    }
}
