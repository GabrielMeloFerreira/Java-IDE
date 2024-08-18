
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scannner = new Scanner(System.in);

        int parametro1, parametro2;


        System.out.println("Digite o primeiro parametro");
        parametro1 = scannner.nextInt();
        System.out.println("Digite o segundo parametro");
        parametro2 = scannner.nextInt();

        try {
            EquacaoExcecao(parametro1, parametro2);
            
        } catch (ParametrosInvalidosException Exception ) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
        static void EquacaoExcecao (int parametro1, int parametro2) throws ParametrosInvalidosException {
            if (parametro1 > parametro2) {
                throw new ParametrosInvalidosException();
            } 
            int resultado = parametro2 - parametro1;
            for (int contagem=1;contagem<=resultado;contagem++) {
                System.out.println("Imprimindo o número " + contagem);
            }
    
    }


    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException() {
        }
    }








    
}
