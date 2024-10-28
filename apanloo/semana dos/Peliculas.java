package semanaDos;

public class Peliculas extends Hobbies{
    private String nombre;
    private String fecha;
    private String genero;

    //Constructor de la clase Peliculas
    public Peliculas(){
        super();// Llama al constructor de la superclase
        this.nombre = nombre;
        this.fecha = fecha;
        this.genero = genero;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setFecha(String fecha) {
        this.fecha = fecha;

    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha(){
        return fecha;
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public String toString(){
        return " Nombre de la pelicula: " + nombre + "| Fecha de emision: " + fecha + "| Genero al que pertenece: " + genero;
    }
}
