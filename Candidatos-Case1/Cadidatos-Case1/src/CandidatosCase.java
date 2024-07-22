import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CandidatosCase {
    public static void main(String[] args) throws Exception {



        String CandidatosLista[] ={"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int CandidatosSelecionados = 0;
        int CandidatosAtual = 0;
        double BaseSalarial = 2000.00;
        ArrayList<String> Selecionados = new ArrayList<>();
        while (CandidatosSelecionados < 5 && CandidatosAtual < CandidatosLista.length) {
            String Candidato = CandidatosLista[CandidatosAtual];
            double SalarioPretendido = valorPretendido();
            System.out.println("O candidato " + Candidato + " Solicitou o seguinte valor de salario: " + SalarioPretendido);
            if (SalarioPretendido <= BaseSalarial) {
                CandidatosSelecionados++;
                Selecionados.add(Candidato);
                System.out.println("O candidato " + Candidato + " Foi selecionado");
            }
            else {
                System.out.println("O candidato " + Candidato + " Não foi selecionado");
            }
            CandidatosAtual++;
        }
        System.out.println("Candidatos Selecionados: ");
        for (String Candidato : Selecionados) {
            System.out.println(Candidato);
        }
    }

        static boolean AtenderLigacao() {
            return new Random().nextInt(3)==1;
        }

        static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

        static void AnalisarCandidato (double SalarioPretendido){
        double BaseSalarial = 2000.00;
        if (SalarioPretendido > BaseSalarial)
            System.out.println("Ligar para o Candidato");
        else if (SalarioPretendido == BaseSalarial)
            System.out.println("Ligar para o Candidato com uma contra proprosta");
        else
            System.out.println("Aguardando demais candidatos");
        }

}
