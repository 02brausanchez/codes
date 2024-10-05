package Recursividad;
import java.util.Arrays;

public class ElementoMayorEnUnArreglo {
    public static int mayor(int [] list, int indiceInferior, int indiceSuperior){
        int max; 
        if(indiceInferior == indiceSuperior){
            return list[indiceInferior]; 
        }else{
            max = mayor(list, indiceInferior + 1, indiceSuperior); 
            if(list[indiceInferior] >= max){
                return list[indiceInferior];
            }else{
                max; 
            }
        }
    }    
    
    
    public static void main(String[] args) {
        int [] array = {23,54,12,3232,777,1001,212,43534,6555765,1}; 
        System.out.println("El elemento mayor en el arreglo es: " + mayor(array, 0, array.length-1));
    }
}
