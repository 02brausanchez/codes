package SemanaSeis;
/*
 * Casos: "h(f(c(a,e),g(,w),l(x,y)" true
 * "h(f(c(a,e),g(,w),l(x(,z),y)" false 
 * modificar este para que el arbol esta lleno 
 */
public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol(); 
        /*
         * casos : 
         * a b c d e f g 
         * h c d c b a h
         */
        a.insertaOrdenado('h');//C
        a.insertaOrdenado('c');//b
        a.insertaOrdenado('d');
        a.insertaOrdenado('c');
        a.insertaOrdenado('b');
        a.insertaOrdenado('a');
        //a.insertaOrdenado('h');
        System.out.println(a.busqueda('w'));
        System.out.println(a.busqueda('z'));
        System.out.println(a.degenerado());

        /*
        a = new Arbol("h(f(c(a,e),g(,w),l(x,y)");
        System.out.println(a);
        System.out.println(a.isCompleto()); 
        */
        }
}
