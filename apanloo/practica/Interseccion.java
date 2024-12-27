package Practica;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Interseccion {
    /*
     * Se deben cumplir de entrada 3 casos: 
     * caso 1:
     * a = [1,2,4,5]
     * b = [3,5,2] 
     * interseccion de [3,2]
     * caso 2: 
     * a = [1,1,1,1]
     * b = [1,1,1,]
     * interseccion de [1]
     * caso 3: 
     * a = []
     * b = []
     * interseccion de [] // esta vacia o no hay ningun elementos
     */

    /* 
    public static int [] interseccion(int []a , int [] b){
        int [] interseccion = new int[a.length + b.length];
        //caso base lista vacia 
        if(a.length == 0 || b.length == 0){return interseccion;}
        int i,j; 
        i = j = 0; 
        
        for(int primero: a){
            a[i++] = primero;
        }
        for(int segundo: b){
            b[j++] = segundo;
        }
        for(int k = 0; k < a.length; k++){
            if(a[i] == b[j]){
                a[i] = interseccion[k];
            }
        }
        
        return interseccion;
    }
    */

    public static List<Integer> obtenInterseccion(int []a, int []b){
        List<Integer> interseccion = new ArrayList<>(); 
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j] && !interseccion.contains(a[i])){
                    interseccion.add(a[i]);
                }
            }
        }
        return interseccion;
    }

    /*
    public static Set<String> encuentraInterseccion(String []a, String []b){
        Set<String> setA = new HashSet<>(); 
        Set<String> interseccion = new HashSet<>(); 
        for(String x: a){
            setA.add(x);
        }      
        for(String x: b){
            if(setA.contains(x)){
                interseccion.add(x);
            }
        }
        return interseccion;
    }*/

    public static List<String> encuentraInterseccion(String []a, String []b){
        Set<String> setA = new HashSet<>(); 
        Set<String> interseccion = new HashSet<>(); 
        for(String x: a){
            setA.add(x.toLowerCase());
        }      
        for(String x: b){
            if(setA.contains(x.toLowerCase())){
                interseccion.add(x.toLowerCase());
            }
        }
        List<String> interseccionLista = new ArrayList<>(interseccion); 
        Collections.sort(interseccionLista);

        return interseccionLista;
    }


    public static void main(String[] args) {
     //Definimos los elementos 
     //int [] a = {1,2,4,5};
     //int [] b = {3,5,2};
     String [] a = {"eduardo", "braulio", "Javier", "Martin", "Ximena"};
     String [] b = {"Fabian", "Eduardo", "Lucas", "tadeo", "ximena"};
     List<String> solucion = encuentraInterseccion(a, b);
     System.out.println("La interseccion de a y b es: " + solucion);  
    }
}
