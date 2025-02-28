package programacaomodular.datamain;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class DataMain {

    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o dia");
        dia = s.nextInt();
        System.out.println("Digite o mes");
        mes = s.nextInt();
        System.out.println("Digite o ano");
        ano = s.nextInt();
        
        Data d = new Data(dia, mes, ano);
        
        System.out.println(d.dataFormatada());
        s.close();
    }
}
