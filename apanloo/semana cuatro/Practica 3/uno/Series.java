package apanloo;

public class Series {
	String nombreSerie; 
	String generoSerie; 
	int yearSerie; 
	
	public Series(String nombreSerie, String generoSerie, int yearSerie ) throws ExceptionSeries{
		if(nombreSerie == null || generoSerie == null){
			throw new ExceptionSeries("Argumentos no validos");
		}
		if(yearSerie < 0){
			throw new ExceptionSeries("Numeros negativos no aceptados"); 
		}
		if(yearSerie >= 2025){
			throw new ExceptionSeries("Serie no confirmada aun"); 
		}
		this.nombreSerie = nombreSerie;
		this.generoSerie = generoSerie; 
		this.yearSerie = yearSerie; 
	}
	
	public int compareTo(Series a) {
		return nombreSerie.compareTo(a.nombreSerie); 
	}
	
	@Override
	public String toString() {
		return "Serie: " + nombreSerie + "| Genero: " 
	+ generoSerie + "| Año: " + yearSerie; 
	
	}
}

