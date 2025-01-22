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

    
    private Nodo minimo(Nodo a) {
        if(a == null){return null;}
        
        Nodo minHizq = minimo(a.hizq);
        Nodo minHder = minimo(a.hder);
        
        Nodo min = a;
        
        if (minHizq != null && minHizq.info < min.info) {
            min = minHizq;
        }
        if (minHder != null && minHder.info < min.info) {
            min = minHder;
        }
        return min;
    }
    
    public void minimo() {
        Nodo nodominimo = minimo(raiz);
        if (nodominimo != null) {
            System.out.println("El valor minimo es: " + nodominimo.info);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    private Nodo encuentraMax(Nodo a) {
        if (a == null) {
            return null;
        }
        Queue<Nodo> queue = new LinkedList<>();
        queue.add(a);
    
        Nodo max = a;
        while (!queue.isEmpty()) {
            Nodo aux = queue.poll();
            if (aux.hizq != null && aux.hizq.info > max.info) {
                max = aux.hder;
            }
            if (aux.hder != null && aux.hder.info > max.info) {
                max = aux.hder;
            }

            if (aux.hizq != null) {
                queue.add(aux.hizq);
            }
            if (aux.hder != null) {
                queue.add(aux.hder);
            }
        }
        return max;
    }
    
    public void encuentraMax() {
        Nodo max = encuentraMax(raiz);
        if (max != null) {
            System.out.println("El valor maximo es: " + max.info);
        } else {
            System.out.println("El arbol esta vacio");
        }
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
