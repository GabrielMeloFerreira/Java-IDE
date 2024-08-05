package ExemploEstruturaDeDados;

public class Aluno {

    private String nome;
    // Atributo privado que armazena o nome do aluno.

    public Aluno(String nome) {
        this.nome = nome;
    }
    // Construtor que inicializa o atributo 'nome' com o valor passado como argumento.

    public String getNome() {
        return nome;
    }
    // Método público que retorna o valor do atributo 'nome'.

    @Override
    public boolean equals(Object obj) {
    // Sobrescreve o método 'equals' para comparar objetos do tipo 'Aluno' com base no atributo 'nome'.
        
        Aluno outro = (Aluno) obj;
    // Converte o objeto 'obj' para o tipo 'Aluno'.

        return outro.getNome().equals(this.nome);
    // Retorna true se o nome do outro objeto for igual ao nome deste objeto.
    }

    @Override
    public String toString() {
        return nome;
    }
    // Sobrescreve o método 'toString' para retornar o nome do aluno quando o objeto for convertido para string.
}