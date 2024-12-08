package Practica;

public class Nodo {
    Nodo hizq, hder,prev,suc;
    char info;
    public Nodo(char info){
        this.info = info;
        hizq = hder = prev = suc = null;
    }
    @Override
    public String toString() {
        return "" + info;
    }

}
