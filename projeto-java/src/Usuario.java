public class Usuario {
    public static void main(String[] args) throws Exception {
         
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("VOLUME ATUAL : " +smartTv.volume);

        
        System.out.println("CANAL ATUAL : " +smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("TV LIGADA ? " + smartTv.ligada);
        System.out.println("CANAL ATUAL : " +smartTv.canal);
        System.out.println("VOLUME ATUAL : " +smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);
    }
}
