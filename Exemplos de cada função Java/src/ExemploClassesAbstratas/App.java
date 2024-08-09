package ExemploClassesAbstratas;

public class App {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
    
}
