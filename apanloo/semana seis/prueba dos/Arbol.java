package prueba;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz; 

    public Arbol(){
        raiz = null;
    }

    private Nodo strToArbol(char[]s, int [] i){
        Nodo aux = new Nodo(s[i[0]]); //elemento 0 del arreglo
        i[0]++;
        if(s[i[0]] == '('){
            i[0]++; //salta
            if(s[i[0]] == ','){
                i[0]++; //salta
                aux.hder = strToArbol(s,i);
                i[0]++; //salta
                return aux;
            }
            aux.hizq = strToArbol(s,i);
            if(s[i[0]] == ','){
                i[0]++; //salta ,
                aux.hder = strToArbol(s,i);
                i[0]++;//salta )
                return aux;
            }
            i[0]++; //salta )
            return aux;
        }
        return aux;
    }
    public Arbol(String a){
        if(a == null){
            raiz = null;
            return;
        }
        if(a.length() == 0){
            raiz = null;
            return;
        }
        char [] s = (a + "#").toCharArray();
        int [] i = new int [1];
        i[0] = 0;
        raiz = strToArbol(s,i);
    }
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