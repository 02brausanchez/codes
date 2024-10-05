package MetodosOrdenamientos;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InsercionDirectaString {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arreglo;

        int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de elementos"));
        arreglo = new String[nElementos];

        //System.out.println("Digite el arreglo: ");
        for(int i = 0 ; i < nElementos; i++){
            System.out.println((i+1)+ " Ingresa nombre ");
            arreglo[i] = sc.nextLine();

        }

        //ordenamiento por Inserccion
        for(int i = 1; i < nElementos; i++){
            int pos = i;
            String aux = arreglo[i];

            while(pos > 0 && arreglo[pos-1].compareTo(aux) > 0){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        System.out.println("\nNOmbres en orden Ascendente: ");
        for(int i = 0; i < nElementos; i++){
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("\n");
   
        System.out.println("Nombres en orden Descendentes: ");
        for(int i = (nElementos-1); i >= 0; i--){
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("");

        sc.close();
    }    
}
