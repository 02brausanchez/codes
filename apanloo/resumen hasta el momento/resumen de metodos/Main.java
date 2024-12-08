package Practica;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();

        a.insertaOrdenado2('a');
        a.insertaOrdenado2('c');
        a.insertaOrdenado2('x');
        a.insertaOrdenado('r');
        a.insertaOrdenado('f');
        a.insertaOrdenado('e');
        a.insertaOrdenado('g');
        a.insertaOrdenado('h');

        System.out.println(a);
        System.out.println(a.esABB());
        a.ponLigas();
        System.out.println(a.recorreLista());
        System.out.println(a.recorreListaAlReves());

        a.buscayBorra2('a');
        a.buscayBorra2('f');

        System.out.println(a);
        System.out.println(a.esABB());
        a.ponLigas();
        System.out.println(a.recorreListaAlReves());
        System.out.println(a.recorreLista());

    }
}
