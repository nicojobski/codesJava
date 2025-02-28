package programacaomodular.jogosmain;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */

public class AdivinheONumero {
    private int numero, min, max;
    private Scanner s = new Scanner(System.in);
    
    AdivinheONumero(){
        Random random = new Random();
        min = 0;
        max = 99;
        numero = random.nextInt(100);
    }
    
    public void ExecutarJogo(){
        System.out.println("Digite um numero entre " + min + " e " + max);
        while(true){
        int inteiro = s.nextInt();
            if (inteiro < numero){
                min = inteiro + 1;
                System.out.println("O numero esta entre " + min + " e " + max);
            }else if (inteiro > numero){
                max = inteiro - 1;
                System.out.println("O numero esta entre "+ min + " e " + max);
        }else if (inteiro == numero){
                System.out.println("Parabens, voce encontrou o numero!");
                break;
    }
    
}
}
}
