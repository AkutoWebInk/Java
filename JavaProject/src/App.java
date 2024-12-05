public class App {
    
public static void main (String[]args){
    
    boolean numero = true;
    int a = 2;
    
    Methods methods = new Methods();
    methods.testPrintIn(numero, a);
    }

    public static  class Methods{

    public  void testPrintIn(boolean numero, int a)
    {
        if(numero && a==2){
            System.out.println(numero);}
        else{
            System.out.println("Error" + "!= Or !=");}
    }
 }


}   