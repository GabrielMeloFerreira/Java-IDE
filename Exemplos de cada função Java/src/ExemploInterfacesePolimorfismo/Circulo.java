package ExemploInterfacesePolimorfismo;

public class Circulo implements Forma {
    // A classe 'Circulo' implementa a interface 'Forma', obrigando a classe a fornecer
    // uma implementação do método 'calcularArea' definido na interface.

    private double raio;
    // Atributo privado que armazena o raio do círculo.

    public Circulo(double raio) {
        this.raio = raio;
    }
    // Construtor que inicializa o atributo 'raio' com o valor passado como argumento.

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
        // Implementação do método 'calcularArea' da interface 'Forma'.
        // Calcula e retorna a área do círculo usando a fórmula πr².
    }


}

