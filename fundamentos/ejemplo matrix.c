#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, j;
    int matrixNumeros[11][11];

    for(i = 1; i < 11; i++){
        for(j = 1; j < 11; j++){
            matrixNumeros[i][j] = i*j;
        } 
    }

    for(i = 1; i < 11; i++){
        for(j = 1; j < 11; j++){
            if(i != 1){
                printf("%d x %d = %d\n",i,j,matrixNumeros[i][j]);
            }
        } 
        printf("\n");
    }

    return 0;
}