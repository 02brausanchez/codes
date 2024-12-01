package lab;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;
    Nodo l;

    public Arbol(){
        raiz  = l = null;
    }

    private Nodo insertaOrdenado(Nodo a, char info){
        if(a == null){return new Nodo(info);}
        if(info < a.info){
            a.hizq = insertaOrdenado(a.hizq, info);
        } else if (info > a.info) {
            a.hder = insertaOrdenado(a.hder,info);
        }
        return a;
    }

    public void insertaOrdenado(char info){
        raiz = insertaOrdenado(raiz, info);
    }


    /*
    public void insertaOrdenado(char info){
        if(l == null){l = new Nodo(info); return;}
        while(l.hizq != null && l.hder != null) {
            if (l.hizq.info < l.hder.info) {
                Nodo aux = new Nodo(info);
                aux.suc = l;
                l.prev = aux;
                return;
            }
        }
        Nodo aux;
        for(aux = l; aux.suc != null; aux = aux.suc){
            if(aux.suc.info > info){
                break;
            }
        }
        Nodo aux2 = new Nodo(info);
        aux2.suc = aux.suc;
        aux.suc = aux.prev;
        aux.prev = aux2;
    }*/

    private boolean esABB(Nodo a, char min, char max){
        if(a == null){return true;}
        if(a.info < min || a.info > max){return false;}
        return esABB(a.hizq, min, a.info) && esABB(a.hder, a.info, max);
    }

    public boolean esABB(){
        return esABB(raiz, Character.MIN_VALUE, Character.MAX_VALUE);
    }

    private Nodo borrarRaiz(Nodo a){
        if(a == null){return null;}
        if(a.hizq == null){return a.hder;}
        if(a.hder == null){return a.hizq;}
        //Busca el predecesor simetrico
        Nodo aux;
        if(a.hizq.hder == null){
            a.info = a.hizq.info;
            a.hizq = a.hizq.hder;
        }else {
            for (aux = a; aux.hder != null; aux = aux.hder) ;
            a.info = aux.hder.info;
            aux.hder = borrarRaiz(aux.hder);
        }
        return  a;
    }

    public void borrarRaiz(){
        raiz = borrarRaiz(raiz);
    }

    private Nodo buscayBorra(Nodo a, char info){
        if(a == null){return null;}
        if(a.info == info){return borrarRaiz(a);}
        if(a.info < info){
            a.hder = buscayBorra(a.hder, info);
        }else{
            a.hizq = buscayBorra(a.hizq, info);
        }
        return a;
    }

    public void buscayBorra(char info){
        raiz = buscayBorra(raiz, info);
    }

    private Nodo ponLigas(Nodo a, Nodo ant){
        if(a == null){return ant;}
        ant = ponLigas(a.hizq, ant);
        //visita
        if(ant == null){//primer elemento de la lista
            l = a;
        }else{
            ant.suc = a;
            a.prev = ant;
        }
        ant = ponLigas(a.hder, a);
        return ant;

    }

    public void ponLigas(){
        ponLigas(raiz, null);
    }

    public String recorreLista(){
        Nodo aux;
        String salida = "";
        for(aux = l; aux != null; aux = aux.suc){
            if("".equals(salida)){
                salida = "" + aux;
            }else{
                salida += "," + aux;
            }
        }
        return salida;
    }

    public String recorreListaAlReves(){
        Nodo aux;
        String salida = "";
        for(aux = l; aux.suc != null; aux = aux.suc);
        for(; aux != null; aux = aux.prev){
            if("".equals(salida)){
                salida = "" + aux;
            }else{
                salida += "," + aux;
            }
        }
        return salida;
    }
}
