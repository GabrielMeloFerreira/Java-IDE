package ExemploInterfacesePolimorfismo;

public class App {

    public static void main(String[] args) {
        Forma[] formas = new Forma[2];
        // Declaração de um array de 'Forma' com capacidade para 2 elementos.
        
        Forma circulo = new Circulo(5);
        // Cria uma instância da classe 'Circulo' com raio 5 e a atribui à variável 'circulo'.
        // A variável 'circulo' é do tipo 'Forma', demonstrando o uso do polimorfismo.

        System.out.println("Área do círculo: " + circulo.calcularArea());
        // Chama o método 'calcularArea' do objeto 'circulo' e imprime o resultado.
        // Isso demonstra o uso do método definido na interface 'Forma' e implementado na classe 'Circulo'.
    }
}