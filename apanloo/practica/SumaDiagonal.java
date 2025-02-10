package Practica;

public class SumaDiagonal {
    public static int sumaDiagonalM(int [][] matriz){
        //Se tendra que recorre la matriz
        int suma = 0;
        int indiceRen = 0;
        int indiceCol = 0;
        for(int i = 0; i < matriz.length; i++){
            suma += matriz[i][i];
        }
        return suma;
    }
    public static void main(String[] args) {
        //Se crea la matriz
        int [][] matrixSuma = {{1,2,3},{4,5,6},{7,8,9}};
        int solucion = sumaDiagonalM(matrixSuma);
        System.out.println(solucion);
    }
}
