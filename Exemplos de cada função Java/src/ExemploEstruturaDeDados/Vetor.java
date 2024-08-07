package ExemploEstruturaDeDados;
import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
   
    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
   
       public Aluno pega(int posicao) {
        if(!posicaoOcupada(posicao)) {
        throw new IllegalArgumentException("posiçao invalida");
        }
        return alunos[posicao];
    }
   
       public void remove(int posicao) {
           //remove pela posição
       }
   
       public boolean contem(Aluno aluno) {
        for(int i = 0; i < totalDeAlunos; i++) {
            if(aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }
   
       public int tamanho() {
           //devolve a quantidade de alunos
           return totalDeAlunos;
       }
   
       public String toString() {
           //facilitará na impressão
           return Arrays.toString(alunos);
       }
   
       private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

   }