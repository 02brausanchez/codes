package apaloo;

public class ColaL {
    private NodoA frente; 
    private NodoB frente_02;

    public ColaL() {
        frente = null; 
        frente_02 = null; 
    }

    public boolean vacia() {
        return frente == null; 
    }

    public boolean llena() {
        return false; 
    }
    
    public void encolar(int dato) {
        if(frente == null) {
            frente = new NodoA(dato); 
        } else {
            NodoA ultimo; 
            for(ultimo = frente; ultimo.sig != null; ultimo = ultimo.sig) {
                // Recorre hasta el último nodo
            }
            ultimo.sig = new NodoA(dato); 
        }
    }

    public int desencolar() {
        if(frente == null) {
            return 0; 
        }
        int aux = frente.dato; 
        frente = frente.sig; 
        return aux; 
    }

    // Método para agregar nodos en frente_02
    public void agregarNodoB(int valor) {
        if(frente_02 == null) {
            frente_02 = new NodoB(valor);
        } else {
            NodoB ultimo; 
            for(ultimo = frente_02; ultimo.sig != null; ultimo = ultimo.sig) {
                // Recorre hasta el último nodo
            }
            ultimo.sig = new NodoB(valor);
        }
    }

    // Método toString que recorre frente_02 y devuelve los valores como una cadena
    @Override
    public String toString() {
        String valores = ""; 
        NodoB aux;
        for(aux = frente_02; aux != null; aux = aux.sig) {
            valores = valores + aux.valor; 
            if(aux.sig != null) { 
                valores = valores + ","; 
            }
        }
        return valores; 
    }

    public void destruir() {
        frente = null; 
        frente_02 = null; 
    }

    public int espacioDisponible() {
        return 1; 
    }
}

