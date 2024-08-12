package ExemploInterface.Multifuncional;

import ExemploInterface.Equipamentos.Copiadora.Copiadora;
import ExemploInterface.Equipamentos.Digitalizadora.Digitalizadora;
import ExemploInterface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via multifuncional...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via multifuncional...");
    }

    public void imprimir() {
        System.out.println("Imprimindo via multifuncional...");
    }
    
}
