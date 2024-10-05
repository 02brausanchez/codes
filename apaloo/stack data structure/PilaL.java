package pilas;

public class PilaL {
    Nodo tope; 
    
    public PilaL(){
    tope = null;
    }

    public void push (int dato){
        Nodo nuevo = new Nodo(dato);                    
        nuevo.sig = tope; 
        tope = nuevo;  
    }
    
    public void destruir(){
        tope = null; 
    }

    public int pop(){
        if(tope == null){
            return 0; 
        }
        //no es nulo 
        int aux = tope.dato; 
        tope = tope.sig;
        return aux; 
    }

    public String eliminaUltimo(){
        String valores = "";
        Nodo aux; 
        for(aux = tope; aux != null && aux.sig != null; aux = aux.sig){
            valores += aux.dato; 
            if(aux.sig != null){
                valores += ","; 
            }
        } 
        return valores; 
    }
    
}
