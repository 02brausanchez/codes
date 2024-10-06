package EjercicioUno;
import java.util.Arrays;
public class PrimerEjercicio {
    public static String [] arreglosCombinados(String [] arregloA, String [] arregloB){
        String [] arregloC = new String[arregloA.length+arregloB.length];
        int posicion = 0;

        for(String elemento: arregloA){
            arregloC[posicion++] = elemento;
        }

        for(String elemento: arregloB){
            arregloC[posicion++] = elemento;
        }

        for(int i = 0; i < arregloC.length-1; i++){
            int menor = i;
            for(int j = i+1; j < arregloC.length; j++){
                if(arregloC[j].compareTo(arregloC[menor]) < 0){
                    menor = j;
                }
            }
            if(i != menor){
                String aux = arregloC[i];
                arregloC[i] = arregloC[menor];
                arregloC[menor] = aux;
            }
        }
        return arregloC;
    }

    public static void main(String[] args) {
        String[] arregloA = {"Alex", "Rafael"}; 
        String[] arregloB = {"Gabriel", "Maria"};
        String [] resultado = arreglosCombinados(arregloA,arregloB);
        System.out.println(Arrays.toString(resultado));
    }
}
