#include <stdio.h>
#include <string.h>
#define TAM 100

int BuscaID(char matrix[TAM][TAM], char palabra[20], int fila, int columnas){
    int j = 0;

    for (int i = 0; i < columnas; i++){
        if (palabra[j] == matrix[fila][i]){
            j++;
            if(j == strlen(palabra)){
                return i;
            }
        }else{
            j=0;
        }   
    }
    return -1;
}

int BuscaDI(char matrix[TAM][TAM], char palabra[20], int fila, int columnas){
    int j = 0;

    for (int i = columnas-1; i >= 0; i--){
        if (palabra[j] == matrix[fila][i]){
            j++;
            if(j == strlen(palabra)){
                return i;
            }
        }else{
            j=0;
        }   
    }
    return -1;
}

int BuscaAB(char matrix[TAM][TAM], char palabra[20], int columna, int filas){
    int j = 0;

    for (int i = 0; i < filas; i++){
        if (palabra[j] == matrix[i][columna]){
            j++;
            if(j == strlen(palabra)){
                return i;
            }
        }else{
            j=0;
        }   
    }
    return -1;
}

int main(){
    char palabras[TAM][20];

    int pos;
    int filas; 
    int columnas; 
    int i,j, n;

    printf("Ingresa la cantidad de filas y columnas para la matriz\n");
    printf("Ingrese la cantidad de filas\n");
    scanf("%d", &filas);
    
    printf("Ingrese la cantidad de columnas\n"); 
    scanf("%d", &columnas); 
    char  matrix[TAM][TAM];
    
    for(i = 0; i < filas; i++ ){
        printf("Ingrese los valores para la fila %d\n", i+1 ); 
        for(j = 0; j < columnas; j++){
            printf("Ingrese el caracter %d\n",j+1); 
            scanf(" %c",&matrix[i][j]);
        }
        printf("\n");
    }

    printf("Cuantas palabras quieres buscar?\n");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Ingresa la palabra %d a buscar \n", i+1);
        scanf("%s", palabras[i]);
    }

    for (int k = 0; k < n; k++) {
        int encontrado = 0;
        for ( i = 0; i < filas; i++){
            pos = BuscaDI(matrix[i], palabras[k], i, columnas); // Busca de derecha a izquierda
            if (pos != -1) {
                printf("La palabra %s se encuentra en la fila %d, columna %d, de derecha a izquierda en la posicion: %d\n", palabras[k], i+1, pos+1, pos);
                encontrado = 1;
            }
            pos =  BuscaID(matrix[i], palabras[k], i, columnas); // Busca de izquierda a derecha 
            if (pos != -1) {
                printf("La palabra %s se encuentra en la fila %d, columna %d, de izquierda a derecha en la posicion: %d\n", palabras[k], i+1, pos+1, pos);
                encontrado = 1;
            }
        }
        for (j = 0; j < columnas; j++){
            pos = BuscaAB(matrix, palabras[k], j, filas); // Busca de arriba a abajo
            if (pos != -1) {
                printf("La palabra %s se encuentra en la fila %d, columna %d, de arriba a abajo en la posicion: %d\n", palabras[k], pos+1, j+1, pos);
                encontrado = 1;
            }
        }
        if(!encontrado){
            printf("La palabra %s no se encuentra en la matriz\n", palabras[k]);
        }
    }
    
    return 0;

}