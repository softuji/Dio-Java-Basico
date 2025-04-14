package pilarespoo.exemplomensagem.apps;
//Encapsulamento

public class Telegram extends ServicoMensagemInstatanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
