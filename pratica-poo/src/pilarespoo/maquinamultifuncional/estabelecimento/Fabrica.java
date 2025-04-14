package pilarespoo.maquinamultifuncional.estabelecimento;

import pilarespoo.maquinamultifuncional.equipamentos.copiadora.Copiadora;
import pilarespoo.maquinamultifuncional.equipamentos.digitalizadora.Digitalizadora;
import pilarespoo.maquinamultifuncional.equipamentos.impressora.Impressora;
import pilarespoo.maquinamultifuncional.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args){
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

    }
}
