package ExemploObjeto;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 20);
        // Criação de um objeto da classe 'Pessoa' com o nome "João" e idade 20.
        // O construtor 'Pessoa(String nome, int idade)' é chamado para inicializar o objeto.

        System.out.println("Nome: " + pessoa1.getNome());
        // Chama o método 'getNome()' do objeto 'pessoa1' e imprime o valor retornado
        // (o nome da pessoa) no console.

        System.out.println("Idade: " + pessoa1.getIdade());
        // Chama o método 'getIdade()' do objeto 'pessoa1' e imprime o valor retornado
        // (a idade da pessoa) no console.
    }
}
