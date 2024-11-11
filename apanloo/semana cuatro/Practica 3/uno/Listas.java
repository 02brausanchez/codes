package apanloo;

public class Listas {
	static Nodo l; 
	private int tamMax; 

	public Listas(int tamMax) throws ExceptionSeries {
		if(tamMax <= 0){
			throw new ExceptionSeries("El tamaño debe ser mayor a 0"); 
		}

		l = null; 
		this.tamMax = tamMax; 
	}
	
	//metodo recursivo 
	public void agregarNodoFinal(Series info) throws ExceptionSeries {
		if(numNodos() >= tamMax){
			throw new ExceptionSeries("Has sobrepasado el limite de la lista"); 
		}

		if(l == null) {
			l = new Nodo(info); 
			return;
		}
		Nodo aux; 
		for(aux = l; aux.sig != null; aux = aux.sig); 
		aux.sig = new Nodo(info); 

	}
	
	@Override 
	public String toString() {
		String aux = ""; 
		for(Nodo aux2 = l; aux2 != null; aux2 = aux2.sig) {
			if(aux.length() == 0) {
				aux += aux2; 
			}else {
				aux = aux + "," + aux2; 
			}
		}
		return aux; 
	}
	
	//Ahora de manera Recursiva 
	private static Nodo agregarFinalR(Nodo a, Series info) {
		if(a == null) {
			return new Nodo(info); 
		}
		a.sig = agregarFinalR(a.sig, info); 
		return a; 
	}
	
	public static void agregarFinalR(Series info) {
		l = agregarFinalR(l, info);  
	}
	
	public int numNodos() {
		int num = 0; 
		for(Nodo aux = l; aux != null; aux = aux.sig) {
			num++;
		}
		return num; 
	}
	
	//De manera recursiva 
	private int numNodosR(Nodo a) {
		if(a == null) {
			return 0; 
		}
		return 1 + numNodosR(a.sig); 
	}
	
	public int numNodosR() {
		return numNodosR(l);
	}
	
	public void insertaOrdenado(Series info) throws ExceptionSeries {
		if(numNodos() >= tamMax){
			throw new ExceptionSeries("Has sobrepasado el limite de la lista"); 
		}
		//lista vacia 
		if(l == null) {
			l = new Nodo(info); 
			return; 
		}
		if(l.info.compareTo(info) > 0) {
			Nodo aux = new Nodo(info); 
			aux.sig = l; 
			l = aux; 
			return;
		}
		Nodo aux; 
		for(aux = l; aux.sig != null; aux = aux.sig) {
			if(aux.sig.info.compareTo(info) > 0) {
				break; 
			}
		}
		Nodo aux2 = new Nodo(info); 
		aux2.sig = aux.sig; 
		aux.sig = aux2; 
	}
	
	private Nodo insertaOrdenadoR(Nodo a, Series info) throws ExceptionSeries {
		if(numNodos() >= tamMax){
			throw new ExceptionSeries("Has sobrepasado el limite de la lista"); 
		}
		
		//Sublista vacia  
		if(a == null) {return new Nodo(info);}
		
		// info < a.info -> a.info > info -> a.info.compareTo(info) > 0 
		//Va antes del primero
		if(a.info.compareTo(info) > 0) {
			Nodo nuevo = new Nodo(info); 
			nuevo.sig = a; 
			return nuevo; 
		}
		a.sig = insertaOrdenadoR(a.sig, info); 
		return a; 
	}
	
	public void insertaOrdenadoR(Series info) throws ExceptionSeries {
		l = insertaOrdenadoR(l,info); 
	}
	
	public void invierte () {
		if(l == null) {return;}
		//if(l.sig == null) {return;}
		
		Nodo ant, act, siguiente; 
		ant = null; 
		act = l; 
		siguiente = act.sig; 
		
		while(siguiente != null) {
			act.sig = ant; 
			ant = act; 
			act = siguiente; 
			siguiente = act.sig; 
		}
		act.sig = ant; 
		l = act; 
	}
		
	private Nodo invierteR(Nodo ant, Nodo a){
		//La sublista esta vacia
		if(a == null) {return null;}
		//La sublista tiene un elemento, el cual es el ultimo		
		if(a.sig == null ){
			a.sig = ant; 
			return a;
		}
		Nodo aux = invierteR(a, a.sig);
		a.sig = ant; 
		return aux;  
	}
	
	public void invierteR(){
		l = invierteR(null, l); 
	}
	
	public int busca(Series a) {
		int contador = 0; 
		for(Nodo aux = l; aux != null; aux = aux.sig, contador++) {
			if (aux.compareTo(a) == 0) {return contador; }
		}
		return -1; 
	}

	public Series extraer() throws ExceptionSeries {
		if(l == null){
			throw new ExceptionSeries("No hay ningun elemento, la lista esta vacia"); 
		}
		Series info = l.info; 
		l = l.sig; 
		return info;
	}
}
