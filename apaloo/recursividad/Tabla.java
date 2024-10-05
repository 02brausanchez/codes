package Recursividad;

public class Tabla {
    public static void mostrarTabla(int num, int indiceInferior, int indiceSuperior){
        if(indiceSuperior == indiceInferior){return;}
        mostrarTabla(num, indiceInferior, indiceSuperior-1);    
        System.out.println(num + " x " + indiceSuperior + " = " + num * indiceSuperior);
       
    }
    
    public static void main(String[] args) {
        int num = 5; 
        int indiceInferior = 0; 
        int indiceSuperior = 12;
        mostrarTabla(num, indiceInferior, indiceSuperior);
    }
}
