package ExemploInterface.Estabelecimento;

import ExemploInterface.Equipamentos.Digitalizadora.Digitalizadora;
import ExemploInterface.Equipamentos.Impressora.Deskjet;
import ExemploInterface.Equipamentos.Impressora.Impressora;
import ExemploInterface.Equipamentos.Copiadora.Copiadora;
import ExemploInterface.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamento = new EquipamentoMultifuncional();
        Impressora impressora = equipamento;
        Digitalizadora digitalizadora = equipamento;
        Copiadora copiadora = equipamento;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
    
}
