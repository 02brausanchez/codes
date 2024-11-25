package ProblemaTres;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }
    private boolean cumpleABB (Nodo raiz){
        if(raiz == null){return false;}
        List<Nodo> l = new LinkedList<>();
        while(l.isEmpty()){
            Nodo a = l.remove(0);
            Nodo menor = a.hizq;
            int limite = l.size();
            for(int i = 0; i < limite; i++){
                if(a.hizq != null && a.hder != null){
                    if(a.hizq < raiz){
                        return false;
                    }else{
                        return true;
                    }
                }
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return true;
    }

    public boolean cumpleABB(){
        return cumpleABB(raiz);
    }

}
