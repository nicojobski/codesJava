package programacaomodular.jogosmain;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */

public class SigaMe {
    private int[] seq;
    private Scanner scanner = new Scanner(System.in);

    public SigaMe() {
        seq = gerarSequencia();
    }

    public void ExecutarJogo() {
        imprimirSequencia(seq);
        validarSequencia(seq);
    }

    private int[] gerarSequencia() {
        int[] s = new int[5];
        Random random = new Random();
        for (int i = 0; i < s.length; i++) {
            s[i] = random.nextInt(100) + 1;
        }
        return s;
    }

    private void imprimirSequencia(int[] s) {
        System.out.println("A sua sequencia é:");
        for (int num : s) {
            System.out.println(num);
            try { Thread.sleep(2000); } catch (InterruptedException e) { }
        }
    }

    private void validarSequencia(int[] s) {
        int[] tentativa = new int[5];
        System.out.println("Digite a sequência:");
        for (int i = 0; i < tentativa.length; i++) {
            tentativa[i] = scanner.nextInt();
        }
        if (Arrays.equals(s, tentativa)) {
            System.out.println("Parabéns, você acertou a sequência!");
        } else {
            System.out.println("Sequência incorreta. Tente novamente.");
        }
    }
}
