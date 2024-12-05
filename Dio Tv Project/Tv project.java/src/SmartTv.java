
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligada=true;
        System.out.println("TV ligada.");
    }

    public void desligar(){
        ligada=false;
        System.out.println("TV desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: "+volume);
    }

    public void diminuitVolume(){
        volume--;
        System.out.println("Volume: "+volume);
    }

    public void aumentarCanal(){
        System.out.println("Canal atual: "+canal);
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: "+canal);
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual: " +canal);
    }


}
