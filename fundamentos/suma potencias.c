#include <stdio.h>
#include <stdlib.h>
#define ARREGLO_SIZE 10

int Arreglo[ARREGLO_SIZE];

void LlenaArreglo() {
    for (int i = 0; i < ARREGLO_SIZE; i++) {
        printf("Ingresa numero: %d\n", i + 1);
        
        if(scanf("%d", &Arreglo[i]) != 1) {
            printf("Valor no valido. Por favor, ingresa un numero.\n");
            i--;
            while(getchar() != '\n'); // Limpia entrada
        }
    }
}

int ArregloPotencia() {
    int suma = 0;
    int potencia = 1;

    for (int i = 0; i < ARREGLO_SIZE; i++) {
        suma += Arreglo[i] * potencia;
        potencia *= 2; 
    }

    return suma;
}

int main() {
    LlenaArreglo();
    int resultado = ArregloPotencia();
    printf("La suma de los numeros en el arreglo elevado es: %d\n", resultado);

    return 0;
}