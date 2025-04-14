package pilarespoo.pacotes;
public class Carro extends Veiculo{
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");        
    }
    private void confereCombustivel(){
        System.out.println("conferindo Combustivel");
    }
    private void confereCambio(){
        System.out.println("conferindo Cambio");
    }
}
