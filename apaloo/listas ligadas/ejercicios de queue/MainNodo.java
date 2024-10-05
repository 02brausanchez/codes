package EjerciciosDeQueue;
//import java.util.Scanner;

public class MainNodo {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int valorNodo;

        ColaL c = new ColaL();
        c.insertaOrdenado(1);
        c.insertaOrdenado(5);
        c.insertaOrdenado(7);
        c.insertaOrdenado(10);
        c.insertaOrdenado(8);
        c.insertaOrdenado(0);
        c.insertaOrdenado(8);
        System.out.println(c);
                                                    
        c.invertir(1);
        c.invertir(5);
        c.invertir(7);
        c.invertir(10);
        c.invertir(8);
        c.invertir(0);
        c.invertir(8);
        System.out.println(c);
        
        /*
        c.encolar(1);
        c.encolar(3);
        c.encolar(9);
        c.encolar(5);
        c.encolar(2);
        c.encolar(9);

        System.out.println("Ingresa un numero para saber si se repite o no ");
        valorNodo = sc.nextInt();
        int printRepetido = c.repetido(valorNodo); 
        System.out.println("El numero " + valorNodo + " se repite " + printRepetido + " veces");
        System.out.println(c.replica());

        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());

        
        ColaL printNodos = new ColaL();
        printNodos.encolar(20);
        printNodos.encolar(1);
        printNodos.encolar(300);
        printNodos.encolar(18);
        printNodos.encolar(19);
        printNodos.encolar(4000);
        
        System.out.println(printNodos.toString());
        System.out.println(printNodos.eliminaUltimoNodo());
        System.out.println(printNodos.eliminaSegundo());
        System.out.println(printNodos.eliminaSegundoConUltimo());

        System.out.println("la suma total es: " + printNodos.sumaNodos());
        System.out.println("valor minimo " + printNodos.nodoMinimo());
        System.out.println("valor maximo " + printNodos.nodoMaximo());
        
        sc.close();
        */
    }
}
