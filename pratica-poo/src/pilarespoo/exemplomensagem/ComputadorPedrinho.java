package pilarespoo.exemplomensagem;

import pilarespoo.exemplomensagem.apps.FacebookMessenger;
import pilarespoo.exemplomensagem.apps.MSNMessenger;
import pilarespoo.exemplomensagem.apps.ServicoMensagemInstatanea;
import pilarespoo.exemplomensagem.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstatanea smi = null; //Polimorfismo

        String appEscolhido = "tlg"; //não sabe qual app enviar e receber msgs

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        else if(appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
