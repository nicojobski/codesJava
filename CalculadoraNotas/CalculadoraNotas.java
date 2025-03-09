/**
 *
 * @author Nico Jobski Andrade
 */
import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ":");
            double nota1 = s.nextDouble();
            double nota2 = s.nextDouble();
            double nota3 = s.nextDouble();
            
            System.out.print("Digite a letra ('A' para média aritmética, 'P' para média ponderada): ");
            char letra = s.next().charAt(0);
            
            calcularMedia(nota1, nota2, nota3, letra);
        }

        s.close();
    }

    public static void calcularMedia(double nota1, double nota2, double nota3, char letra) {
        if (letra == 'A' || letra == 'a') {
            double mediaAritmetica = (nota1 + nota2 + nota3) / 3;
            System.out.println("Média Aritmética: " + mediaAritmetica);
        } else if (letra == 'P' || letra == 'p') {
            double mediaPonderada = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
            System.out.println("Média Ponderada: " + mediaPonderada);
        } else {
            System.out.println("Letra inválida!");
        }
    }
}
