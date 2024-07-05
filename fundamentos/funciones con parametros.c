#include <stdio.h>

void LLenarArreglo(int Arreglo[10]){
    for (int i = 0; i < 10; i++){
        printf("Ingresa numero: %d\n", i + 1);
        scanf("%d", &Arreglo[i]);
    }
}

void MinMax(int Arreglo[10], int *min, int *max){
    *min = Arreglo[0];
    *max = Arreglo[0];

    for (int i = 0; i < 10; i++){
        if (Arreglo[i] < *min){
            *min = Arreglo[i];
        }   
        if (Arreglo[i] > *max){
            *max = Arreglo[i];
        }
    }
}

void SumaProducto(int Arreglo[10], int *sum, int *prod){
    *sum = 0;
    *prod = 1;
    for (int i = 0; i < 10; i++){
        *sum += Arreglo[i]; 
        *prod *= Arreglo[i];
    }  
}

int main(){
    int Arreglo[10];
    int min , max , sum, prod; 

    LLenarArreglo(Arreglo);
    SumaProducto(Arreglo, &sum, &prod);
    MinMax(Arreglo, &min, &max);
    printf("El minimo es de: %d y el maximo es de: %d\n", min, max); 
    printf("La suma es de: %d y el producto de: %d\n", sum, prod);

    return 0;
}