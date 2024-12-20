package PracticaSiete;
import java.util.LinkedList;
import java.util.List;

public class ListaCoord {
    List<Coordenada> l;
    public ListaCoord(){
        l = new LinkedList();
    }

    public void agregaCoordenada(Coordenada c){
        l.add(c);
    }

    @Override
    public String toString(){
        String aux = "";
        for(Coordenada c : l){
            if(aux.length() == 0){
                aux += c;
            }else{
                aux += ","+c;
            }
        }
        return aux;
    }
}
