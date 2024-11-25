package prueba;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol a = new Arbol(); 
        a = new Arbol("h(f(c(a,e),g(,w),l(x(,z),y)");
        System.out.println(a);
        System.out.println(a.visitaxNivel()); 
    }
    
}
