package MetodosOrdenamientos;

import java.util.Arrays;

public class FB1 {
    static public int [] ordenadoFB1(int [] datos){
        int[] ordenado = new int[datos.length];
        for(int i = 0; i < datos.length; i++){
            int menor  = 0; //posicion
            for(int j = 1; j < datos.length; j++){
                if(datos[j] <= datos[menor]){
                    menor = j;
                }
            }
            ordenado[i] = datos[menor];
            datos[menor] = Integer.MAX_VALUE;
        }
        return ordenado;
    }

    public static void main(String[] args) {
      int[] valores = {5,2,4,9,20,3,6,16};
      int[] result = ordenadoFB1(valores);
      System.out.println(Arrays.toString(result));
    }
}
