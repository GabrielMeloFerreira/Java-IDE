
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scannner = new Scanner(System.in);

        int parametro1, parametro2, quantidadeFinal;


        System.out.println("Digite o primeiro parametro");
        parametro1 = scannner.nextInt();
        System.out.println("Digite o segundo parametro");
        parametro2 = scannner.nextInt();

        int resultado = parametro2 - parametro1;

        for (int contagem=0;contagem<resultado;contagem++) {
            System.out.println("Imprimindo o número " + contagem);
            
        }

    }

        static void EquacaoExcecao (int parametro1, int parametro2) {
            int ContarExcecao = parametro2 - parametro1;
            return;
    }








    
}
