package pilarespoo.exemplomensagem.apps;
//Encapsulamento

public class MSNMessenger extends ServicoMensagemInstatanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
