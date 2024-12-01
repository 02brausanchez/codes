package lab;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a.insertaOrdenado('h');
        a.insertaOrdenado('x');
        a.insertaOrdenado('d');
        a.insertaOrdenado('b');
        a.insertaOrdenado('c');
        a.insertaOrdenado('r');
        a.insertaOrdenado('s');

        a.ponLigas();
        System.out.println(a.recorreLista());
        System.out.println(a.recorreListaAlReves());

    }
}
