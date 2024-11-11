package apanloo;

public class Nodo {
	Series info; 
	Nodo sig; 
	
	public Nodo(Series info) {
		this.info = info; 
		this.sig = null; 
	}
	
	@Override 
	public String toString() {
		return "[" + info + "]"; 
	}
	
	public int compareTo(Series a) {
		return info.compareTo(a); 
	}
}
