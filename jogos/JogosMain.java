package programacaomodular.jogosmain;

import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */

public class JogosMain {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("MENU, Digite 1 para Adivinhe o numero, Digite 2 para Siga-me, Digite 3 para Suporte");
      int inteiro = s.nextInt();
      if (inteiro==1){
        AdivinheONumero a = new AdivinheONumero();
        a.ExecutarJogo();
      }
      if(inteiro==2){
          SigaMe b = new SigaMe();
          b.ExecutarJogo();
      }
      
      s.close();
    }
}
