package CuartoEjercicio;
import java.util.Arrays;

public class ArbolMain {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a = a.ejemplo();
        System.out.println(Arrays.toString(a.sumaNodosHastaNivel(4)));

    }
}
