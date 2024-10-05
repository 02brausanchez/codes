package MetodosOrdenamientos;
import java.util.Arrays;

public class InserccionDirectaStr {

    public static EstudianteV2[] insDirecStr(EstudianteV2[] datos) {
        // Ordenamiento por inserción directa
        for (int i = 1; i < datos.length; i++) {
            int pos = i;
            EstudianteV2 aux = datos[i];

            while (pos > 0 && datos[pos - 1].compareTo(aux) > 0) {
                datos[pos] = datos[pos - 1];
                pos--;
            }
            datos[pos] = aux;
        }

        System.out.println("\nOrdenados ascendentes: ");
        for (EstudianteV2 dato : datos) {
            System.out.println(dato);
        }

        System.out.println("\nOrdenados descendentes: ");
        for (int i = datos.length - 1; i >= 0; i--) {
            System.out.println(datos[i]);
        }

        return datos;
    }

    public static void main(String[] args) {
        EstudianteV2[] datos = {
                new EstudianteV2(2112214, "alexander"),
                new EstudianteV2(2213163, "josue"),
                new EstudianteV2(2322111, "carlos"),
                new EstudianteV2(2412243, "ian")
        };

        System.out.println(Arrays.toString(insDirecStr(datos)));
    }
}

