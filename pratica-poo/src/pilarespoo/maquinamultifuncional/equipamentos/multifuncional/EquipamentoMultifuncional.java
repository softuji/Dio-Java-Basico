package pilarespoo.maquinamultifuncional.equipamentos.multifuncional;

import pilarespoo.maquinamultifuncional.equipamentos.copiadora.Copiadora;
import pilarespoo.maquinamultifuncional.equipamentos.digitalizadora.Digitalizadora;
import pilarespoo.maquinamultifuncional.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAENTO MULTIFUNCIONAL");
    }

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAENTO MULTIFUNCIONAL");
    }

    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAENTO MULTIFUNCIONAL");
    }
    
}
