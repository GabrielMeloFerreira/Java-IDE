package ExemploObjeto;

// Declaração do pacote onde a classe 'Pessoa' está localizada.

public class Pessoa {

    private String nome;
    private int idade;
    // Declaração dos atributos privados 'nome' (String) e 'idade' (int).

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        // Construtor da classe 'Pessoa'. Inicializa os atributos 'nome' e 'idade'
        // com os valores fornecidos quando um objeto é criado.
    }

    public String getNome() {
        return nome;
        // Método público que retorna o valor do atributo 'nome'.
    }

    public int getIdade() {
        return idade;
        // Método público que retorna o valor do atributo 'idade'.
    }
}
