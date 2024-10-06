package omegaup;
import java.util.Scanner;

public class Alumnos_Calificacion {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int valorExamen, porcentajeExamen, valorAsistencia, porcentajeAsistencia;
    int valorTarea, porcentajeTarea;
    int sumaTotal;

    valorExamen = teclado.nextInt();
    valorAsistencia = teclado.nextInt();
    valorTarea = teclado.nextInt();
    porcentajeExamen = (int) (valorExamen * 0.6);
    porcentajeAsistencia = (int) (valorAsistencia * 0.2);
    porcentajeTarea = (int) (valorTarea * 0.2);
    sumaTotal = porcentajeExamen + porcentajeAsistencia + porcentajeTarea;

    System.out.println(sumaTotal);

    teclado.close();
    
    }
}
