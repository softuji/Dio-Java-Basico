public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(); //forma de criar uma classe

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: "+ smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+ smartTv.canal);
        
        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? "+ smartTv.ligada);
        
    }    
}