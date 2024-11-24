package PrimerEjercicio;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainException {
    public static void main(String[] args) {
        Persona alguien = new Persona();
        try {
            alguien.ponFechaNacimiento(new GregorianCalendar(2025, 1, 1));
        }catch (FechaException e){
            System.out.println("(Fecha) Se ha producido un error: ");
            System.out.println(e.getMessage());
        }
        try {
            alguien.ponGenero('P');
        }catch (GeneroException e){
            System.out.println("(Genero) Se ha producido un error ");
            System.out.println(e.getMessage());
        }
        try {
            alguien.ponFechaNacimiento(new GregorianCalendar(2003, 2, 28));
            alguien.ponGenero('H');
            System.out.println(alguien);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
