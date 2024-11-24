package EjercicioCinco;

public class MainCinco {
    public static void main(String[] args) {
        ArbolCinco a = new ArbolCinco("a(b(c,d),e(f))"); 
        ArbolCinco clonado = a.clonar();
        System.out.println("Arbol original: " + a);
        System.out.println("Arbol clonado: " + clonado);

    }
}
