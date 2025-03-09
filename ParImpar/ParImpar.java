import java.util.Scanner;

/**
 *
 * @author Nico Jobski Andrade
 */

public class ParImpar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] parImpar = new int[2];
        for(int i=0; i<10; i++){
            System.out.println("Digite um valor para adicionar ao vetor:");
            vetorA[i] = s.nextInt();
            if(vetorA[i]%2==0){
                parImpar[0]+=1;
            }else{
                parImpar[1]+=1;
            }
        }
        System.out.println(parImpar[0] + " sao pares e " + parImpar[1] + " sao impares.");
    }
}
