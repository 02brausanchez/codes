
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Alumno implements Comparable <Alumno> {
    private long Matricula; 
    private String Nombre; 
    private char Genero; 
    private GregorianCalendar fechaNacimiento;  
    
    //Constructor con todos lo datos
    public Alumno(long Matricula, String Nombre,char Genero,
    GregorianCalendar fechaNacimiento){
        this.Matricula = Matricula; 
        this.Nombre = Nombre; 
        this.Genero = Genero; 
        this.fechaNacimiento = (GregorianCalendar)fechaNacimiento.clone();
    }

    //Contructor de la estructura en blanco 
    public Alumno(){
        this.Matricula = 0; 
        this.Nombre = ""; 
        this.Genero = ' '; 
        this.fechaNacimiento = new GregorianCalendar();
    }
    //Metodos para extraer los atributos 
    public long getMatricula(){
        return Matricula;
    }
    public String getNombre(){
        return Nombre;
    }
    public char getGenero(){
        return Genero;
    }
    //Metodos para modificar los atributos 
    public void setMatricula(long Matricula){
        this.Matricula = Matricula;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setGenero(char Genero){
        this.Genero = Genero;
    }
    public void setFechaNacimiento(GregorianCalendar fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString(){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(fechaNacimiento.getTime()); 
        return Matricula + "" + Nombre + "" + Genero + "" + formatted;
    }

    public String getFechaNacimiento(){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(fechaNacimiento.getTime()); 
        return formatted;
    }

    public boolean equals(Alumno unAlumno){
        if(this.Matricula == unAlumno.Matricula){
            return true;
        }else{
            return false;
        }
    }

    public int BuscaPos(long Matricula){
        return 0;
    }

    @Override
    public int compareTo(Alumno alumno){
        return this.fechaNacimiento.compareTo(alumno.fechaNacimiento);
    }
}
