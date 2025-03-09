
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */
public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de conjuntos de números: ");
        int N = s.nextInt();  

        for (int i = 0; i < N; i++) {
            System.out.println("Digite 3 números inteiros:");
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int num3 = s.nextInt();
            ordenarValores(num1, num2, num3);
        }
        
        s.close();
    }
    
    public static void ordenarValores(int a, int b, int c) {
        int[] numeros = {a, b, c};  
        Arrays.sort(numeros);  
        System.out.println("Ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
