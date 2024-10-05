package apaloo;

public class Main {
    public static void main(String[] args) {
        ColaL c = new ColaL(); 
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
 
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        
        ColaL printNodos = new ColaL(); 
        printNodos.agregarNodoB(5); 
        printNodos.agregarNodoB(6); 
        printNodos.agregarNodoB(7); 

        System.out.println(printNodos.toString());
        
    }
}
