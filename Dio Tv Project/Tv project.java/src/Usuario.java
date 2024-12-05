public class Usuario {
    public static void main(String[] args) throws Exception {
        
        
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: "+ smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(13);
        for (int i=0; i<10; i++){
            smartTv.aumentarVolume();
        }
    }
}
