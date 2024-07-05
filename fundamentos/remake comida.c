#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Menu(){
    printf("1.- Despliega arreglo\n");
    printf("2.- Suma opuesta\n");
    printf("3.- Promedio de datos\n");
    printf("4.- Minimo datos\n");
    printf("5.- Buscar letra\n");
    printf("6.- Salir del programa\n");

}

void DespliegaArreglo(){
    int num;
    printf("Cuantos numeros quieres desplegar?\n");
    scanf("%d", &num);
    int Array[num];
    for ( int i = 0; i < num; i++){
        printf("Ingresa numero %d\n",i+1);
        scanf("%d",&Array[i]);
    }
    printf("Los numeros desplegados son:\n");
    for (int i = 0; i < num; i++){
        printf("%d\n",Array[i]);
    }
    
}

void SumaOpuesta(){
    int k; 
    //int sum = 0;
    printf("Ingresa la cantidad de tu arreglo tiene que ser numero par\n");
    scanf("%d",&k);
    int Array[k];
    
    if( Array[k] % 2 == 0){
        for(int i = 0; i < k; i++){
            printf("Ingresa numero %d\n", i+1);
            scanf("%d", &Array[i]);
        }
        for(int i = 0; i < k/2; i++){
            printf ("%d\n", Array[i] + Array[k-i-1]);
        }
        
    }else{
        printf("El numero dado no es par\n");
    }

}


int PromedioDatos(){
    int datos; 
    int sum = 0;

    printf("Dime el numero de datos que quieres saber su promedio sin punto decimal\n");
    scanf("%d",&datos);
    int Array[datos];

    for (int i = 0; i < datos; i++){
        printf("Ingresa dato %d\n",i+1);
        scanf("%d",&Array[i]);
        sum += Array[i];
    }
       
    return sum / datos;

}

void MinimoDato(){
    int n;
    int min;

    printf("Cuantos numeros quieres poner en tu arreglo?\n");
    scanf("%d", &n);
    int Array[n];
    for ( int i = 0; i < n; i++){
        printf("Ingresa numero %d\n",i+1);
        scanf("%d", &Array[i]);
    }
    min = Array[0];
    for (int  i = 0; i < n; i++){
            if(Array[i] < min){
                min = Array[i]; 
            }
    }
    printf("El valor minimo dentro del arreglo es de %d\n",min);
}

int BuscaLetra(char cadena[20], char l){
    int i = 0;
    int longitud = strlen(cadena);
    for(int i = 0; i < longitud; i++){
        if(cadena[i] == l){
            return i;
        }
    }
    return -1;
}


int main (){
    int opc;
    int pos = -1;
    char letra;
    char cadena[20];
    char rep;

    //int muestraDespliego;
    do{
    printf("Elegi una de las siguiente opcines:\n");
    printf("===================================\n");
    Menu();
    scanf("%d", &opc);
    
    switch (opc)
    {
    case 1:
        printf("Haz elegido Despliego de arreglo\n");
        DespliegaArreglo();

        break;

    case 2:
        printf("Haz elegido Sumas Opuestas\n");
        SumaOpuesta();

        break;

    case 3:
        printf("Haz elegido Promedio de datos\n");
        int promedio = PromedioDatos();
        printf("El promedio es de: %d\n", promedio);
        break;

    case 4:
        printf("Haz elegido Minimo dato\n");
        MinimoDato();

        break;

    case 5:    
        printf("Haz elegido Buscar letra\n");
        printf("Ingresa un palabra\n");
        scanf("%s", cadena);
        
        printf("Que letra quieres buscar?\n");
        scanf(" %c", &letra );
        pos = BuscaLetra(cadena,letra);
        if(pos != -1){
        printf("La letra %c se encontro en la posicion %d",letra,pos);
        }else{
        printf("La letra %c se encontro en la posicion %d",letra,pos);    
        }
        break;

    case 6:
        printf("Hasta luego =)\n");
        break;    
                  
    default:
        printf("No haz seleccionada nada del menu");
        break;
    }
    printf("Deseas repetir este u otros programas? (Si) s <- (No) n <-\n");
    scanf(" %c", & rep);
    }while(rep != 'n');
    printf("Hasta luego =)\n");

    return 0;
}