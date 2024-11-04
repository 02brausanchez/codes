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
}
