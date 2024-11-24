package SextoEjercicio;
import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;

    public static Arbol ejemplo1() {
        Arbol aux = new Arbol();
        aux.raiz = new Nodo('k');
        aux.raiz.hizq = new Nodo('l');
        aux.raiz.hder = new Nodo('m');

        aux.raiz.hizq.hizq = new Nodo('n');
        aux.raiz.hizq.hder = new Nodo('o');
        aux.raiz.hder.hizq = new Nodo('q');
        aux.raiz.hder.hder = new Nodo('r');
        return aux;
    }

    public Arbol() {raiz = null;}

    public int visitaxNivel2(Nodo raiz){
        if(raiz ==  null){
            return -1;
        }
        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        int tam;
        int nivel = 0;
        boolean hoja = false;

        while((tam = l.size())!= 0){
            nivel++;
            for(int i = 0; i < tam; i++) {
                Nodo a = l.remove(0);
                if (a.hizq == null && a.hder == null) {
                    hoja = true;
                }else{
                    if(hoja){
                        return -1;
                    }
                }
                if (a.hizq != null) {
                    l.add(a.hizq);
                }
                if (a.hder != null) {
                    l.add(a.hder);
                }
            }
        }
        return nivel;
    }

    public boolean visitaxNivel(){
        return visitaxNivel2(raiz) >= 0;
    }
}
