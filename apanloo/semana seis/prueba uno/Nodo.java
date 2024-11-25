package SemanaSeis;
public class Nodo {
    Nodo hder, hizq; 
    char info; 

    public Nodo(char info){
        this.info = info; 
        hder = hizq = null;
    }

    @Override
    public String toString(){
        return  "[" + info + "]";
    }
    
}
