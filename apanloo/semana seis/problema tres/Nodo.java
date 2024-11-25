package ProblemaTres;

public class Nodo {
    Nodo hizq, hder;
    char info;
    public Nodo(char info){
        this.info = info;
        hder = hizq = null;
    }
    @Override
    public String toString(){
        return "[" + info + "]";
    }
}
