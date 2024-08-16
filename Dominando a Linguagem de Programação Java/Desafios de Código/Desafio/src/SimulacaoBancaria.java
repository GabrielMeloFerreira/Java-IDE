import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:{
                    saldo = scanner.nextDouble();
                    System.out.println(String.format("%.1f",saldo));
                    break;}
                case 2:{
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado > saldo){
                      System.out.println("Saldo insuficiente");
                    }
                    else {
                      saldo = saldo - valorSacado;
                      System.out.println(String.format("%.1f",saldo));
                    }
                    break;}
                case 3:{
                      System.out.println(String.format("%.1f",saldo));
                    break;}
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}