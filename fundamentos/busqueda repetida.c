#include <stdio.h>
#include <stdlib.h>

void BusquedaRepetida(int Array[], int n){
    int maxCount = 0;
    int maxNum = 0;

    for(int i = 0 ; i < n; ++i){
        printf("Ingresa numero\n");
        scanf("%d",&Array[i]);
    }

    for(int i = 0; i < n; ++i){
        int count = 0;
        for(int j = 0; j < n; ++j){
            if(Array[j] == Array[i])
                count++;
        }
        if(count > maxCount){
            maxCount = count;
            maxNum = Array[i];
        }
    }

    printf("El numero %d se repite %d veces\n", maxNum, maxCount);
}

int main(){
    int num;
    printf("Ingresa el numero de tu secuencia:\n");
    scanf("%d", &num);
    int Array[num];
    
    BusquedaRepetida(Array,num);
    return 0;
}