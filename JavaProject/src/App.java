public class App {
    
public static void main (String[]args){
    
    boolean numero = true;
    int a = 2;
    App test = new App();

    test.testPrintIn(numero, a);
    }

    public void testPrintIn(boolean numero, int a)
    {
        if(numero && a==2){
            System.out.println(numero);}
        else{
            System.out.println("Error" + "!= Or =!");}
    }

}   