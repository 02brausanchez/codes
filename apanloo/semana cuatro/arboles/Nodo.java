package Arboles;

public class Nodo {
    Nodo hizq,hder;
    char info;
    public Nodo(char info){
        this.info = info;
        hizq = hder = null;
    }
    @Override
    public String toString(){
        return "" + info;
    }
}
