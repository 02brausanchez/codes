package SemanaSiete;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol(/*"a(b(c,d),e(f)"*/);

        a.insertaOrdenado('h');
        a.insertaOrdenado('c');
        a.insertaOrdenado('r');
        a.insertaOrdenado('b');
        a.insertaOrdenado('x');
        //a.insertaOrdenado('d');



        /*
        a.insertaOrdenado('x');
        a.insertaOrdenado('d');
        a.insertaOrdenado('b');
        a.insertaOrdenado('c');
        a.insertaOrdenado('r');
        a.insertaOrdenado('s');
        a.insertaOrdenado('e');
        a.insertaOrdenado('f');
        */
        
        //a.ponLigas();
        //System.out.println("Antes: "+a);
        //a.buscayBorra('h');
        //System.out.println("Despues: "+a);
        System.out.println(a);
        System.out.println(a.recorreLista());
        System.out.println(a.recorreListaAlReves());

    }
}
