import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();
            
            verificarNumeroConta(numeroConta);
          
            System.out.println("Numero de conta valido.");
        } catch (IllegalAccessError exception) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalAccessError{
        if (numeroConta.length() != 8) {
            throw new IllegalAccessError();
        }
    }
}