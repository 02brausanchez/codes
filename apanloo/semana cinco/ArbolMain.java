package Arboles;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol arbol = ejemplo2();

        System.out.println("Recorrido previo:");
        arbol.previo();

        System.out.println("\nRecorrido en orden:");
        arbol.enOrden();

        System.out.println("\nRecorrido postorden:");
        arbol.postOrden();

        System.out.println("\nNúmero de nodos: " + arbol.numNodo());

        System.out.println("\nHojas del árbol:");
        arbol.soloHojas();

        System.out.println("\nNodos no hoja:");
        arbol.noHojas();

        System.out.println("\nAltura del árbol: " + arbol.altura());

        System.out.println("\nRepresentación del árbol:");
        System.out.println(arbol);
    }

    public static Arbol ejemplo2() {
        Arbol aux = new Arbol();
        aux.raiz = new Nodo('a');
        aux.raiz.hizq = new Nodo('b');
        aux.raiz.hder = new Nodo('c');
        aux.raiz.hizq.hizq = new Nodo('d');
        aux.raiz.hizq.hder = new Nodo('e');
        aux.raiz.hder.hizq = new Nodo('f');
        aux.raiz.hder.hder = new Nodo('g');
        aux.raiz.hizq.hder.hder = new Nodo('h');
        return aux;
    }
}
