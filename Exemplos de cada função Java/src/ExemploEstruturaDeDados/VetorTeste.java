package ExemploEstruturaDeDados;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());
    
        System.out.println(lista);

        System.out.println(lista.contem(a1));

        Aluno x = lista.pega(1);
        System.out.println(x);
    }

    
}