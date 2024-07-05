#include <stdio.h>
#include <stdlib.h>

int main (){
    int i, j, filas, columnas; 
    double acumuladorSuma, promedio;
    promedio = 0; acumuladorSuma = 0;

    printf("Ingresa la cantidad de filas y columnas para la matriz\n");
    printf("Ingrese la cantidad de filas\n");
    scanf("%d",&filas);

    printf("Ingrese la cantidad de columnas\n");
    scanf("%d",&columnas);

    double matrixNumeros[filas][columnas];

    for(i = 0; i < filas; i++){
        printf("Ingrese los valores para la fila %d\n",i+1);
        for(j = 0; j < columnas; j++){
            printf("Ingrese los valores para la columas %d\n",j+1);
            scanf("%lf",&matrixNumeros[i][j]);
        }
        printf("\n");
    }

    //Mostrar la matriz 

    for(i = 0; i < filas; i++){
        for(j = 0; j < columnas; j++){
            printf("%lf ",matrixNumeros[i][j]);
        }
        printf("\n");
    }

    //desarrollando los parametros del problema
    for(i = 0; i < filas; i++){
        for(j = 0; j < columnas; j++){
          acumuladorSuma += matrixNumeros[i][j];  
        }
    }

    promedio = acumuladorSuma / (filas * columnas);

    //Mostrar el resultado por consola 

    printf("\n");
    printf("El promedio de la matriz es: %lf\n",promedio);
    printf("La suma global de la matriz es de: %lf\n",acumuladorSuma);

    return 0;
}