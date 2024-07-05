#include <stdio.h>
#include <string.h>
#define TAM 100

int BuscaID(char cadena[TAM], char palabra[20]){
    int i; 
    int j;

    for (i = 0; i < TAM; i++){
        if (cadena[i] == palabra[j]){
            j++;
            if(j == strlen(palabra)){
                return (i-strlen(palabra)+1);
            }
        }else{
            j=0;
        }   
    }
    return -1;
}

int BuscaDI(char cadena[TAM], char palabra[20]){
    int i; 
    int j = 0;

    for (i = TAM; i >= 0; i--){
        if (cadena[i] == palabra[j]){
            j++;
            if(j == strlen(palabra)){
                return (i+strlen(palabra-1));
            }
        }else{
            j=0;
        }   
    }
    return -1;
}

int main(){
    char palabra[20];
    char cadena[20];

    int pos;
    int filas; 
    int columnas; 
    int i,j;
    printf("Ingresa la cantidad de filas y columnas para la matriz\n");
    printf("Ingrese la cantidad de filas\n");
    scanf("%d", &filas);
    
    printf("Ingrese la cantidad de columnas\n"); 
    scanf("%d", &columnas); 
    char  matrix[TAM][TAM];
    
    for(i = 0; i < filas; i++ ){
        printf("Ingrese los valores para la fila %d\n", i+1 ); 
        for(j = 0; j < columnas; j++){
            printf("Ingrese la cadena %d\n",j+1); 
            scanf("%s",&matrix[i][j]);
        }
        printf("\n");
    }

    printf("Ingresa palabra a buscar \n");
    scanf("%s", palabra);

    for ( i = 0; i < filas; i++){
        for (j = 0; j < columnas; j++){
            pos = BuscaDI(matrix[i], palabra); // Busca de derecha a izquierda
            //printf("La posicion de la cadena: %d\n", pos);
            pos =  BuscaID(matrix[i], palabra); // Busca de izquierda a derecha 
            //printf("La posicion de la cadena: %d\n", pos);
        }   
    }

    
    printf("La posicion de la cadena de derecha a izquierda: %d\n", pos);
    printf("La posicion de la cadena de izquierda a derecha: %d\n", pos);


    return 0;
}