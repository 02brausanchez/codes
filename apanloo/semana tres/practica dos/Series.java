package apanloo;

public class Series {
	String nombreSerie; 
	String generoSerie; 
	int yearSerie; 
	
	public Series(String nombreSerie, String generoSerie, int yearSerie ) {
		this.nombreSerie = nombreSerie;
		this.generoSerie = generoSerie; 
		this.yearSerie = yearSerie; 
	}
		
	public int compareTo(Series a) {
		return nombreSerie.compareTo(a.nombreSerie); 
	}
	
	@Override
	public String toString() {
		return "Nombre de la serie:🎬 " + nombreSerie + "| Genero de la serie: " 
	+ generoSerie + "| Año de emison de la serie: " + yearSerie; 
	
	}
}

