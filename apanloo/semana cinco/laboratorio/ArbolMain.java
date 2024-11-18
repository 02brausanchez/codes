package PracticaCuatro;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        Arbol b = new Arbol();
        a = a.ejemplo1();
        b = b.ejemplo2();

        System.out.println("Recorrido previo:");
        b.previo();

        System.out.println("Recorrido en orden:");
        b.enOrden();

        System.out.println("Recorrido postorden:");
        b.postOrden();

        System.out.println("Número de nodos: " + b.numNodo());

        System.out.println("Hojas del árbol:");
        b.soloHojas();

        System.out.println("Nodos no hoja:");
        b.noHojas();

        System.out.println("Altura del árbol: " + b.altura());
        System.out.println("Hay nodos iguales: " + b.iguales(b));
        System.out.println("Representación del árbol:");
        System.out.println(b);
    }
}
