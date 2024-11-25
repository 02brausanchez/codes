package CuartoEjercicio;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;
    public Arbol (){
        raiz = null;
    }
    public Arbol ejemplo(){
        Arbol aux = new Arbol();
        aux.raiz = new Nodo(3);
        aux.raiz.hizq = new Nodo(4);
        aux.raiz.hder = new Nodo(6);
        aux.raiz.hizq.hizq = new Nodo(1);
        aux.raiz.hizq.hder = new Nodo(2);
        aux.raiz.hizq.hder.hizq = new Nodo(3);
        aux.raiz.hizq.hder.hder = new Nodo(2);
        return aux;
    }

    public int [] sumaNodosHastaNivel(int nivel){
        int [] datos = new int[nivel];
        if(raiz == null){
            return datos;
        }
        int suma = 0;
        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        for(int i = 1; i <= nivel && ((l.size()) != 0); i++){
            int limite = l.size();
            for(int j = 0; j < limite; j++){
                Nodo a = l.remove(0);
                suma += a.info;
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
                datos[i-1] = suma;
            }
        }
        return datos;
    }
}
