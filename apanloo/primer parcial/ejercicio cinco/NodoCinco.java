package EjercicioCinco;

public class NodoCinco {
    NodoCinco hizq, hder; 
    char info;
    public int newHder; 

    public NodoCinco(char info){
        this.info = info; 
        hizq = hder = null;
    }

    @Override
    public String toString(){
        return "" + info;
    }
}
