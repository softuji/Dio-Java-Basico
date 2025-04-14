package pilarespoo.exemplomensagem.apps;
//Encapsulamento

public abstract class ServicoMensagemInstatanea {//Abstraçao: classe abstrata vazia
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este método (ausente no PCPedrinho)
    protected void validarConectadoInternet(){
        System.out.println("Verificando a conexão Internet");
    }
}
