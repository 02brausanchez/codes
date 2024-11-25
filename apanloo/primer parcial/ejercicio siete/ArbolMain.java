package SeptimoEjercicio;
import java.util.Arrays;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol a = new Arbol("a(b(c,d),e(f)");
        System.out.println(Arrays.toString(a.recorridoxNivel(4)));
    }
}
