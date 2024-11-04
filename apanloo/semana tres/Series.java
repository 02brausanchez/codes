package apanloo;

public class Series {
    String nombre;
    String genero; 
    int year;

    public int compareTo(Series a) {
    	return nombre.compareTo(a.nombre); 
    }
    
}
