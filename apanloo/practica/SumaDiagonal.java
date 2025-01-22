package Practica;

public class SumaDiagonal {
    /*  Problema:
        Hay que hacer una matriz de n x m
        es decir hay que considerar las matrices cuadradas
        en donde se tendra que sumar sus diagonales.
        Ejemplo:
        Dada una matriz A de 2 x 2:
        {[1,2],[1,2]}^t
        1 2
        1 2 -> la suma en digonal: 3
        otro ejemplo:
        Dada una matriz de 3 x 3:
        1 2 3
        4 5 6
        7 8 9 -> suma en diagonal: 15
     */

    /*
        renglon[i]
        columna[j]
        j|0 1 2
        i|1
         |2
        interseccion:
        cual es punto de [i] y [j] en el caso de 2x3
        1:[0][0]
        5:[1][1]
        9:[2][2]
        Notamos que siempre seran pares la suma de renglo[i] y columna[j]
        una posible condicion si es cuadrada suma respecto a ren y col
        [0][0] + [1][1] + [2][2] = 1 + 5 + 9 = 15

     */
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
