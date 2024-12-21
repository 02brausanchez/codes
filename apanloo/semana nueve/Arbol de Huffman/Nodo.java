package ArbolHuffman;

public class Nodo {
    char simbolo;
    int frec;
    Nodo hizq, hder;

    public Nodo(char simbolo, int frec){
        this.simbolo = simbolo;
        this.frec = frec;
        hizq = hder = null;
    }

    public int compareTo(Nodo b){
        return frec-b.frec;
    }
}
