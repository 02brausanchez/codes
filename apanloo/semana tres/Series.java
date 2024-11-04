package apanloo;

public class Series {
    String nombre;
    int year;
    String genero; 
    

    public int compareTo(Series a) {
    	return nombre.compareTo(a.nombre); 
    }
    
}
