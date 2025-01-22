package Examen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Nodo {
    Nodo hizq, hder;
    char info;
    public Nodo(char info){
        this.info = info;
        hizq = hder = null;
    }
    @Override
    public String toString(){
        return ""+ info;
    }
}

class Arbol{
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    public static Arbol ejemplo1() {
        Arbol aux = new Arbol();
        aux.raiz = new Nodo('k');
        aux.raiz.hizq = new Nodo('l');
        aux.raiz.hder = new Nodo('m');
        aux.raiz.hizq.hizq = new Nodo('n');
        aux.raiz.hizq.hder = new Nodo('o');
        aux.raiz.hder.hizq = new Nodo('p');
        aux.raiz.hder.hder = new Nodo('q');
        return aux;
    }

    //Metodo para recorrer un arbol y ponerle una coma, despues de cada elemento
    private String recorreArbol(Nodo a){
        if(a == null){
            return "";
        }
        String aux = "" + a;
        if(a.hizq != null){
            aux += "," + recorreArbol(a.hizq);
        }
        if(a.hder != null){
            aux += "," + recorreArbol(a.hder);
        }
        return aux;
    }

    public String recorrerArbol(){
        return recorreArbol(raiz);
    }

    //version mejorada con usando lista
    public String visitaxNivel2(){
        String aux = "";
        List<Nodo> l = new LinkedList<>();
        //Agregamos la raiz
        l.add(raiz);
        int tam;
        while((tam = l.size())!= 0){
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if("".equals(aux)){
                    aux = ""+a;
                }else{
                    aux += ","+a;
                }
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return aux;
    }
}

public class Soluciones {
    public boolean esMultiplo(int []datos){
        if(datos.length < 2){
            return false;
        }
        for(int i = 1; i < datos.length; i++){
            if(datos[i] % datos[i-1] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean estanOrdenados(int []datos){
        for(int i = 0; i < datos.length-1; i++){
            if(datos[i] > datos[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Arbol a = new Arbol();
        a = a.ejemplo1();
        System.out.println("Primer metodo: "+a.recorrerArbol());
        System.out.println("Segundo metod: "+a.visitaxNivel2());
    }
}
