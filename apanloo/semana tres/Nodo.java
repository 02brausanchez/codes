package apanloo;

public class Nodo {
    int info; 
	Nodo sig; 
	
	public Nodo(int info) {
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
	
	
	/*
	public int compareTo(int a) {
		//llamar al compareTo de la clase que se va a crear 
		//turn info.compareTo(a.info) 
		return info-a; 
	}
	*/	
}
