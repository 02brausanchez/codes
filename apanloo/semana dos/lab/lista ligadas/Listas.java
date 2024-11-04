package apanloo;

public class Listas {
    private  Nodo l; 
	
	public Listas() {
		l = null; 
	}
	
	//metodo recursivo 
	public void agregarNodoFinal(int info) {
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
	private static Nodo agregarFinalR(Nodo a, int info) {
		if(a == null) {
			return new Nodo(info); 
		}
		a.sig = agregarFinalR(a.sig, info); 
		return a; 
	}
	
	public void agregarFinalR(int info) {
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
	
	public void insertaOrdenado(int info) {
		//lista vacia 
		if(l == null) {
			l = new Nodo(info); 
			return; 
		}
		if(l.info > info) {
			Nodo aux = new Nodo(info); 
			aux.sig = l; 
			l = aux; 
			return;
		}
		Nodo aux; 
		for(aux = l; aux.sig != null; aux = aux.sig) {
			if(aux.sig.info > info) {
				break; 
			}
		}
		Nodo aux2 = new Nodo(info); 
		aux2.sig = aux.sig; 
		aux.sig = aux2; 
	}
	
	private Nodo insertaOrdenadoR(Nodo a, int info) {
		//Sublista vacia  
		if(a == null) {return new Nodo(info);}
		
		//Va antes del primero
		if(info < a.info) {
			Nodo nuevo = new Nodo(info); 
			nuevo.sig = a; 
			return nuevo; 
		}
		a.sig = insertaOrdenadoR(a.sig, info); 
		return a; 
	}
	
	public void insertaOrdenadoR(int info) {
		l = insertaOrdenadoR(l, info); 
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
	/*
	private Nodo invierteR(Nodo a) {
    	if (a == null || a.sig == null) {
        	return a;
    	}
    	Nodo aux = invierteR(a.sig);
    	a.sig.sig = a;
    	a.sig = null;
    	return aux;
	}

	public void invierteR() {
    	  	l = invierteR(l);
	}*/ 
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
}
