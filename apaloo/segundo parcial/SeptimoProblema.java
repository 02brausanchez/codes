package Apaloo;
import java.util.Arrays;

public class SeptimoProblema {
    private static void Swap(int [] A, int i, int j){
        int aux = A[i];
        A[i] = A[j];
        A[j] = aux;
    }

    private  static int ParticionarSimple(int [] A, int izq, int der){
        int pivote = izq; //Considera como pivote el elemento mas a la izquierda 
        izq++; //incrementa en uno por el pivote
        while (true){
            while (A[der] > A[pivote]){
                der--;
            }
            while (izq <= der && A[izq] <= A[pivote]){
                izq++;
            }
            if(izq >= der){break;}
            else {
                Swap(A, izq, der);
            }
        }
        Swap(A, pivote, der);
        return der;
    }

    public static void mQuickShort(int [] A, int izq, int der){
        if(izq < der){
            //El metodo particionar regresa el pivote
            int k = ParticionarSimple(A, izq , der);
            //Llama recursivamente a QuickShort con el pivote seleccionado por ParticionSimple
            mQuickShort(A, izq, k-1);
            mQuickShort(A, k+1, der);
        }
    }

    public static void main(String[] args) {
        int [] datos = {5,10,3,6,2,9,11,15,4};
        
        mQuickShort(datos,0,datos.length-1);
        System.out.println(Arrays.toString(datos));

    }
}
