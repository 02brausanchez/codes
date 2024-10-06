package EjercicioCinco;
import java.util.Arrays;
public class Resumen {
    int numeroEmp; // numero de empleado
    int cantDepEcon; // cantidad de dependientes economicos

    public Resumen(int numeroEmp, int cantDepEcon){
        this.numeroEmp = numeroEmp;
        this.cantDepEcon = cantDepEcon;
    }

    @Override
    public String toString() {
        return "Empleado: " + numeroEmp + " - Cantidad de dependientes: " + cantDepEcon;
    }

    // Método para crear el arreglo Resumen
    public static Resumen[] crearResumen(Empleado[] arraEmpleados, Dependiente[] arraDependientes) {
        Resumen[] arraResumen = new Resumen[arraEmpleados.length];

        // Recorrer el arreglo de empleados
        for (int i = 0; i < arraEmpleados.length; i++) {
            int numeroEmp = arraEmpleados[i].numeroEmp;
            int contadorDependientes = 0;

            // Contar la cantidad de dependientes por empleado
            for (Dependiente dependiente : arraDependientes) {
                if (dependiente.numeroEmp == numeroEmp) {
                    contadorDependientes++;
                }
            }

            // Crear un nuevo objeto Resumen con el numero de empleado y la cantidad de dependientes
            arraResumen[i] = new Resumen(numeroEmp, contadorDependientes);
        }

        return arraResumen;
    }

    public static void main(String[] args) {
        Empleado[] arraEmpleados = {
                new Empleado(161193, "Eduardo"),
                new Empleado(161500, "Maria"),
                new Empleado(203012, "Rene"),
                new Empleado(312106, "Miguel")
        };

        Dependiente[] arraDependientes = {
                new Dependiente(161193, "Jimena", "Hija"),
                new Dependiente(161193, "Lucia", "Hija"),
                new Dependiente(161193, "Roxana", "Esposa"),
                new Dependiente(203012, "Rosa", "Esposa"),
                new Dependiente(203012, "Alex", "Hijo"),
                new Dependiente(312106, "Marco", "Hijo")
        };

        // Crear el arreglo Resumen
        Resumen[] arraResumen = Resumen.crearResumen(arraEmpleados, arraDependientes);

        // Mostrar los resultados
        System.out.println("Resumen de empleados y sus dependientes:");
        for (Resumen resumen : arraResumen) {
            System.out.println(resumen);
        }
    }
}
