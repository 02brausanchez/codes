package PracticaCinco;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a.insertaOrdenado2('a');
        a.insertaOrdenado2('f');
        a.insertaOrdenado2('b');
        a.insertaOrdenado2('c');
        a.insertaOrdenado2('g');
        a.insertaOrdenado2('i');
        a.insertaOrdenado2('h');
        a.insertaOrdenado2('k');

        System.out.println(a);
        System.out.println(a.esABB());
        a.ponLigas();
        System.out.println(a.recorreLista());
        System.out.println(a.recorreListaAlReves());

        a.buscayBorra2('a');
        a.buscayBorra2('f');
        a.buscayBorra2('b');
        a.buscayBorra2('c');
        a.buscayBorra2('g');
        a.buscayBorra2('i');

        System.out.println(a);
        System.out.println(a.esABB());
        a.ponLigas();
        System.out.println(a.recorreLista());
        System.out.println(a.recorreListaAlReves());

    }
}
