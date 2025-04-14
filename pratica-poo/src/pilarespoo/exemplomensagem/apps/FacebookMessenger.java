package pilarespoo.exemplomensagem.apps;
//Encapsulamento

public class FacebookMessenger extends ServicoMensagemInstatanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
