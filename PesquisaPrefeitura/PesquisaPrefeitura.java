import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */
public class PesquisaPrefeitura {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<float[]> salarioFilhos = new ArrayList<>();

        System.out.println("Bem-vindo ao sistema de média de salários da população");

        while (true) {
            System.out.println("Digite o salário total da família ou um número negativo para parar:");
            float salario = s.nextFloat();

            if (salario < 0) {
                break;
            }

            System.out.println("Digite o total de filhos do membro da família ou um número negativo para parar:");
            float filhos = s.nextFloat();

            if (filhos < 0) {
                break;
            }

            salarioFilhos.add(new float[]{salario, filhos});

            float media = metodoMediaSalario(salarioFilhos);
            System.out.println("A média total atual é " + media);
        }

        s.close();
    }

    public static float metodoMediaSalario(ArrayList<float[]> salarioFilhos) {
        float soma = 0;
        int totalPessoas = salarioFilhos.size();

        for (float[] familia : salarioFilhos) {
            float salario = familia[0]; 
            int numeroFilhos = (int) familia[1]; 
            int totalFamilia = numeroFilhos + 1; 

            if (totalFamilia > 0) {
                soma += salario / totalFamilia;
            }
        }

        return totalPessoas > 0 ? soma / totalPessoas : 0;
    }
}

