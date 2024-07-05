#include <stdio.h>
#include <stdio.h>
#include <string.h>
#define TAM 100

/*
    Cad: abcxvfvwaxcasaltxwzt
    palabra : casa
    Cad2: xtrfvxasacrlast 
    palabra : casa 
*/

int BuscaID(char cadena[TAM], char palabra[20]){
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
    int pos = -1;

    printf("Ingresa cadena a buscar\n");
    scanf(" %s", cadena);
    printf("Ingresa palabra\n");
    scanf(" %s", palabra);

    pos = BuscaID(cadena, palabra);
    printf("La posicion de la cadena: %d\n",pos);


    return 0;
}