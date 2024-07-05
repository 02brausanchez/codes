#include <stdio.h>
#include <string.h>
#define TAM 100

int BuscaID(char cadena[TAM], char palabra[20]){
    int i; 
    int j = 0;

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
    char palabras[TAM][20];
    char cadena[20];

    int pos;
    int filas; 
    int columnas; 
    int i,j, n;

    printf("Ingresa la cantidad de filas y columnas para la matriz\n");
    printf("Ingrese la cantidad de filas\n");
    scanf("%d", &filas);
    
    printf("Ingrese la cantidad de columnas\n"); 
    scanf("%d", &columnas); 
    char  matrix[TAM][TAM][TAM];
    
    for(i = 0; i < filas; i++ ){
        printf("Ingrese los valores para la fila %d\n", i+1 ); 
        for(j = 0; j < columnas; j++){
            printf("Ingrese la cadena %d\n",j+1); 
            scanf("%s",matrix[i][j]);
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
            for (j = 0; j < columnas; j++){
                pos = BuscaDI(matrix[i][j], palabras[k]); // Busca de derecha a izquierda
                if (pos != -1) {
                    printf("La palabra %s se encuentra en la fila %d, columna %d, de derecha a izquierda en la posicion: %d\n", palabras[k], i+1, j+1, pos);
                    encontrado = 1;
                }
                pos =  BuscaID(matrix[i][j], palabras[k]); // Busca de izquierda a derecha 
                if (pos != -1) {
                    printf("La palabra %s se encuentra en la fila %d, columna %d, de izquierda a derecha en la posicion: %d\n", palabras[k], i+1, j+1, pos);
                    encontrado = 1;
                }
            }   
        }
        if(!encontrado){
            printf("La palabra %s no se encuentra en la matriz\n", palabras[k]);
        }
    }
    
    return 0;

}