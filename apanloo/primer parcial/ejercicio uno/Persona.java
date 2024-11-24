package PrimerEjercicio;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Persona {
    GregorianCalendar fechaNacimiento;
    char genero;

    public void ponFechaNacimiento (GregorianCalendar fecha) throws FechaException{
        GregorianCalendar hoy = new GregorianCalendar();
        if(fecha.after(hoy)){
            throw new FechaException("La fecha no puede estar adelantada");
        }
        if(fecha.get(Calendar.YEAR) < hoy.get(Calendar.YEAR) - 130){
            throw new FechaException("La fecha de nacimiento excede los 130 años");
        }
        this.fechaNacimiento = fecha;
    }

    public void ponGenero(char genero) throws GeneroException{
        if(genero != 'H' && genero != 'M'){
            throw new GeneroException("Caracter no valido solo se acepta 'H' y 'M' ");
        }
        this.genero = Character.toUpperCase(genero);
    }

    public int edad(){
        if(fechaNacimiento == null){
            return -1;
        }
        Calendar hoy = new GregorianCalendar();
        int res = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            res--;
        }
        return res;
    }

    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = fechaNacimiento != null ? sdf.format(fechaNacimiento.getTime()): "No definida";
        return "[ fecha " + fecha + ", Edad " + edad() + ", Genero " + genero + " ]";
    }
}
