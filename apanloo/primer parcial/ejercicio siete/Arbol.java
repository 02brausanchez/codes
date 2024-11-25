package SeptimoEjercicio;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;
    public Arbol (){
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
        int [] i = new int[1];
        i[0] = 0;
        raiz = strToArbol(s,i);

    }

    public int [] recorridoxNivel(int tam){
        int [] datos = new int[4];
        if(raiz == null ){
            return datos;
        }

        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        int tope;
        while((tope = l.size())!= 0){
            Nodo a = l.remove(0);
            datos[0]++;
            Nodo hijoIzquierdo = a.hizq;
            Nodo hijoDerecho = a.hder;

            if(hijoIzquierdo == null && hijoDerecho == null){
                datos[1]++;
            } else if (hijoIzquierdo != null && hijoDerecho != null) {
                datos[3]++;
            }else{
                datos[2]++;
            }

            if(hijoIzquierdo != null){
                l.add(hijoIzquierdo);
            }
            if(hijoDerecho != null){
                l.add(hijoDerecho);
            }
        }
        return datos;
    }

}
