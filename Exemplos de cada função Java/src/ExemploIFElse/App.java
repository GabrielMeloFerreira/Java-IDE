package ExemploIFElse;

public class App {
    public static void main(String[] args) {
    
        int estoque = 100;
        // Declaração e inicialização da variável 'estoque' com o valor 100.

        if (estoque >= 100) {
            System.out.println("Produto com quantidade suficiente.");
            // Se o valor de 'estoque' for maior ou igual a 100, imprime essa mensagem.
        } else if (estoque < 100 && estoque > 50) {
            System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
            // Se 'estoque' for menor que 100 e maior que 50, imprime essa mensagem.
        } else {
            System.out.println("ATENÇÃO! Faça um novo pedido.");
            // Se todas as condições anteriores forem falsas, imprime essa mensagem.
        }

        String mensagem = (estoque >= 100) ? "Estoque está cheio." : "Estoque precisa ser reabastecido.";
        // Usa um operador ternário para definir a mensagem com base na condição:
        // Se 'estoque' é maior ou igual a 100, a mensagem será "Estoque está cheio.";
        // caso contrário, será "Estoque precisa ser reabastecido."

        System.out.println(mensagem);
        // Imprime a mensagem definida pelo operador ternário no console.
    }
}
