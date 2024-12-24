package Practica;

import java.util.Arrays;

public class combinarArreglos {
    /*
    public static int [] combinarArreglos(int [] a, int [] b){
        //se crea el nuevo arreglo c 
        int [] c = new int[a.length+b.length];
        //int valorA = a.length-1;
        //int valorB = b.length-1; 

        for(int i = 0; i < a.length; i++){
            int min = i;
            for(int j = 0; j < b.length; j++){
                if(a[i] <= b[j]){
                    a[i] = a[min];
                    a[min] = c[min];  
                }else{
                    b[j] = b[min]; 
                    b[min] = c[min]; 
                }
                min++;
            }
            int aux = c[min];
            if(aux < c[min]){
                aux = c[aux]; 
                c[aux] = c[i];
            }
        }
        return c;
    }
    */
    public static void ordenarBurbuja(String[] arreglo) { 
        int n = arreglo.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) { 
                    //Intercambiar arreglo[j] y arreglo[j + 1] 
                    String aux = arreglo[j]; 
                    arreglo[j] = arreglo[j + 1]; 
                    arreglo[j + 1] = aux; 
                } 
            } 
        } 
    }    
   
    public static String [] intercalarArreglos(String [] a, String [] b){
        ordenarBurbuja(a);
        ordenarBurbuja(b);
        String [] c = new String[a.length + b.length]; 
        int i = 0, j = 0, k = 0; 
        while( i < a.length || j < b.length){
            String menor; 
            if (i < a.length && (j >= b.length || a[i].compareTo(b[j]) <= 0)) {
                menor = a[i]; 
                i++; 
            }else{
                menor = b[j]; 
                j++;
            }
            c[k++] = menor;
        }
        return c;
    } 

    public static void main(String[] args) {
        String [] a = {"Carlos","Tania","Adrian"}; 
        String [] b = {"Maria","Eduardo","Zeus"}; 
        String [] solucion = intercalarArreglos(a, b);
        System.out.println(Arrays.toString(solucion));
    }
}
