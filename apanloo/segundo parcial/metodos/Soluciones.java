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
        //aux.raiz.hizq.hder.hder = new Nodo('k');
        return aux;
    }

    /*
    private Nodo maxIterativo(Nodo a){
        if(a == null){
            return null;
        }
        Queue<Nodo> queue = new LinkedList<>();
        Nodo max = a;
        while(queue.isEmpty()){
            Nodo aux = queue.poll();
            if(aux.hizq != null && aux.hizq.info > max.info){
                max = aux.hizq;
            }
            if(aux.hder != null && aux.hder.info > max.info){
                max = aux.hder;
            }
            if(aux.hizq != null){
                queue.add(aux.hizq);
            }
            if(aux.hder != null){
                queue.add(aux.hder);
            }
        }
        return max;
    }
    public void maxIterativo(){
        Nodo max = maxIterativo(a.info);
        if(max != null){
            System.out.println("El numero mas grande es:"+max.info);
        }else{
            System.out.println("El arbol esta vacia");
        }
    }*/

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

    /*
    private Nodo encuentraMax(Nodo a){
        if (a == null) {
            return null;
        }
        Nodo maxHizq = encuentraMax(a.hizq);
        Nodo maxHder = encuentraMax(a.hder);
        Nodo max = a;
        if (maxHizq != null && maxHizq.info > max.info){
            max = maxHizq;
        }
        if(maxHder != null && maxHder.info > max.info){
            max = maxHder;
        }
        return max;
    }

    public void encuentraMax(){
        Nodo max = encuentraMax(a);
        if(max != null){
            System.out.println("El entero mas grandes es:" + max.info);
        }else{
            System.out.println();
        }
    }*/


}

public class Soluciones {
    /*Problema 5 Parte 2
    Descripcion:
    Dado un arreglo de enteros cree un método que regrese verdadero si el elemento i-esimo es un múltiplo del i-1
    para i >= 1 (Ósea, el primer elemento no es múltiplo de ninguno).
    * */
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

    /*Problema 3 Parte 2
      Cree un metodo iterativo que se le pase un arreglo de enteros
      y regrese verdadero si los elementos del arreglo estan ordenados
      en orden creciente(Debe permitir repetidos).
    * */

    public boolean estanOrdenados(int []datos){
        for(int i = 0; i < datos.length-1; i++){
            if(datos[i] > datos[i-1]){
                return false;
            }
        }
        return true;
    }

    /*
        Problema 6 Parte 2
        Cree un metodo NO recursivo que dato un arbol ordenado de busqueda
        que almacena en sus nodos un entero regre el entero mas grande.

     */

    /*
    Problema 7 parte 2
    Cree un metodo recursivo que dado un arbol No ordenado que almacena
    en sus nodos un entero regrese el entero mas grande.
     */

    /*
        Problema 8 parte 2
        Cree un metodo que recursivo que le pase la referencia a la raiz de un arbol
        y regresa la longitud de la rama mas corta.
     */
    /*
    public int ramaMasCorta(Nodo a){
        if(a == null){
            return a.info;
        }

        List<Nodo> l = new LinkedList<>();
        l.add(raiz);

        while(l.isEmpty()){
            Nodo aux = l.remove(0);
            if(aux.hizq == null )
        }


    }*/

    /*
    //Acomodar una matriz
    public int [][] acomodarMatriz(int [][] matrix){
        for(int i = 0; i  < matrix.length; i++){
            Arrays.sort(matrix);
        }
        for(int i = 0 ; i < matrix.[i]; i++){
            
        }
    }*/

    public static void main(String[] args) {
        Arbol a = new Arbol();
        a = a.ejemplo1();
        System.out.println("Primer metodo: "+a.recorrerArbol());
        System.out.println("Segundo metod: "+a.visitaxNivel2());
    }
}
