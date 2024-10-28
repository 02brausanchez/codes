package semanaDos;

public class Videojuegos extends Hobbies {
    private String nombre;
    //private String fecha;
    private int year;
    private int precio;
    private int salud;
    private int habilidad;
    private int damage;

    //Constructor de la clse Videojuego
    public Videojuegos(){
        super();//Llama al constructor de la superclase
        this.salud = 100;
        this.habilidad = habilidad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getYear() {
        return year;
    }

    public int getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return " Nombre del videojuego: " + nombre + "| Fecha de lanzamiento: " + year + "| costo $" + precio + " MX ";
    }
}