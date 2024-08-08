package ExemploInterfacesePolimorfismo;

public interface Forma {
    // Declaração de uma interface chamada 'Forma'.
    // Uma interface define métodos que devem ser implementados pelas classes que a implementam.

    double calcularArea();
    // Método abstrato 'calcularArea' que deve ser implementado por qualquer classe que implemente esta interface.
    // Este método não possui corpo, apenas a assinatura, indicando que deve retornar um valor do tipo 'double'.
}