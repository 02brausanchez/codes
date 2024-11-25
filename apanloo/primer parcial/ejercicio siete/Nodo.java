package SeptimoEjercicio;

public class Nodo {
    Nodo hizq, hder;
    int info;
    public Nodo(int info){
        this.info = info;
        hizq = hder = null;
    }
    @Override
    public String toString(){
        return "["+ info + "]";
    }
}
