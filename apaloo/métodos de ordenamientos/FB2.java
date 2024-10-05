package MetodosOrdenamientos;
import java.util.Arrays;
/* De esta manera los imprime a la inversa:
        int aux = datos[i];
        datos[i] = datos[j];
        datos[j] = aux;
*/

public class FB2 {
    static public int[] ordenadoFB2(int [] datos){
        for(int i = 0; i < datos.length; i++){
            int menor = i;
            for(int j = i+1; j < datos.length; j++){
                if(datos[j]<= datos[menor]){
                    menor = j;
                }
            }
            int aux = datos[i];
            datos[i] = datos[menor];
            datos[menor] = aux;
        }
        return datos;
    }

    public static void main(String[] args) {
        int [] valores = {7,3,9,2,21,100};
        int [] result = ordenadoFB2(valores);
        System.out.println(Arrays.toString(result));
    }
}


