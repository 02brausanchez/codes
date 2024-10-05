package MetodosDeOrdenamientos;
//import java.util.Scanner;

public class Search_Linear_Binary {

    public int searchLinear(int [] datos, int dato){
        for(int i = 0; i < datos.length; i++){
            if(datos[i] == dato){
                return i; 
            }
        }
        return -1; 
    }

    public int searchBinary(int[]datos, int dato){
        int min, medio, max; 
        min = 0; 
        max = datos.length-1; 
        while(min <= max){
            medio = (min + max)/2; 
            if(datos[medio] == dato){
                return medio; 
            }
            if(datos[medio] > dato){
                max = medio -1; 
            }else{
                min = medio + 1; 
            }
        }
        return -1; 
    }
    

    public static void main(String[] args) {
        Search_Linear_Binary searcher = new Search_Linear_Binary(); 
    
        /* Casos en los que se ocupa Scanner para preguntarle 
            al usuario los numero de su arreglo
        */

        /* 
        Scanner sc = new Scanner(System.in); 
        int n; 
        System.out.println("De cuanto va hacer el tamaño de tu arreglo?");
        n = sc.nextInt();
        int [] datos = new int[n]; 

        for(int i = 0; i < n; i++){
            System.out.println("Ingresa el numero " + (i+1) + " de tu arreglo: ");
            datos[i] = sc.nextInt();
        }
        
        System.out.println("Que numero quieres encontrar con la busqueda lineal? ");
        int dato = sc.nextInt(); 
        int resultSearchLinear = SearchLinear(datos, dato); 
        System.out.println("EL elemento se encuentra en la posicion: " + resultSearchLinear + "\n");

    System.out.println("/***********************************************************************************");

        int num; 
        System.out.println("De cuanto va hacer el tamaño de tu arreglo?");
        num = sc.nextInt(); 
        int [] elementos = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("Ingresa el numero " + (i+1) + " de tu arreglo: ");
            elementos[i] = sc.nextInt(); 
        }
        
        System.out.println("Que numero quieres encontrar con la busqueda binaria? ");
        int datosElementos = sc.nextInt(); 

        int resultSearchBinary = SearchBinary(elementos, datosElementos); 
        System.out.println("El elemento se encuentra en la posicion : "+resultSearchBinary);

        sc.close();
        */

        int [] datos = {1,2,3,4,9};
        int resultSearchLinear = searcher.searchLinear(datos, 3);     
        System.out.println("Busqueda lineal: ");
        System.out.println( "El dato se encuentra en la posicion: "+ resultSearchLinear+"\n"); 
    
        System.out.println("Busqueda Binaria: ");
        int [] datosElementos = {7,10,12,17,20,25,28,40,45,92}; 
        int resultSearchBinary = searcher.searchBinary(datosElementos, 17);
        System.out.println("El dato se encuentra en la posicon: "+ resultSearchBinary);

    }
}
