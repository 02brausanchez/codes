#include <stdio.h>
#include <stdlib.h>

void LlenaArreglo(int Arreglo[], int n) {
    for (int i = 0; i < n; i++) {
        printf("Ingresa numero: %d\n", i + 1);
        
        if(scanf("%d", &Arreglo[i]) != 1) {
            printf("Valor no valido. Por favor, ingresa un numero.\n");
            i--;
            while(getchar() != '\n'); // Limpia entrada
        }
    }
}

int ArregloPotencia(int Arreglo[], int n) {
    int suma = 0;
    int potencia = 1;

    for (int i = 0; i < n ; i++) {
        suma += Arreglo[i] * potencia;
        potencia *= 2; 
    }

    return suma;
}

int main() {
    int num;
    printf("Ingresa el Size que quieres que tenga el arreglo:\n");
    scanf("%d",&num);
    int Arreglo[num];
    
    LlenaArreglo(Arreglo,num);
    int resultado = ArregloPotencia(Arreglo,num);
    printf("La suma de los numeros en el arreglo elevado es: %d\n", resultado);

    return 0;
}