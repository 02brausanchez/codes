package CuartoEjercicio;

public class Nodo {
    Nodo hder, hizq;
    int info;
    public Nodo(int info){
        this.info = info;
        hder = hizq = null;
    }
    @Override
    public String toString(){
        return "[" +info+ "]";
    }
}
