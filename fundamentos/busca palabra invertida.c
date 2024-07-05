#include <stdio.h>
#include <string.h>
#define TAM 100

void invertir(char* palabra, char* palabra_invertida) {
    int longitud = strlen(palabra);
    for (int i = 0; i < longitud; i++) {
        palabra_invertida[i] = palabra[longitud - i - 1];
    }
    palabra_invertida[longitud] = '\0';
}

int BuscaDI(char cadena[TAM], char palabra[20]){
    char palabra_invertida[20];
    invertir(palabra, palabra_invertida);

    int i; 
    int j = 0;

    for (i = 0; i < TAM ; i++){
        if (cadena[i] == palabra_invertida[j]){
            j++;
            if(j == strlen(palabra_invertida)){
                return (i-strlen(palabra_invertida)+1);
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
    int pos = -1;

    printf("Ingresa cadena a buscar\n");
    scanf("%s",cadena);
    printf("Ingresa palabra\n");
    scanf("%s",palabra);

    pos = BuscaDI(cadena, palabra);
    printf("La posicion de la cadena: %d\n",pos);

    return 0;
}