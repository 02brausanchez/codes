package Archivos; 

public class BorradorMB {
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
            
    public static void main(String arg[]){  
    int vec[]={6,8,3,5,4,9,0,2,1,7};
    System.out.print("Vector sin ordenar: ");
    for(int i=0;i<vec.length;i++){
         System.out.print(vec[i]+" ");
    }
    //Ordenamiento
    for(int i=0; i < vec.length-1; i++){
        for(int j=0; j < (vec.length-1-i); j++){  
            if(vec[j] > vec[j+1]){  
                int aux=vec[j];                 
                vec[j]=vec[j+1];           
                vec[j+1]=aux;
            }    
        }
    }

    System.out.print("\nVector ordenado: ");
    for(int i=0;i<vec.length;i++){
        System.out.print(vec[i]+" ");
    }
    }    
}
