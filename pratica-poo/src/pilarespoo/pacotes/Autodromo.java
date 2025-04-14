package pilarespoo.pacotes;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("987987");
        //jeep.ligar();
        
        Moto z400 = new Moto();
        z400.setChassi("123123");
        //z400.ligar();

        Veiculo coringa = z400; //polimorfismo(pode trocar por jeep ou z400)
        coringa.ligar();        
    }
}
