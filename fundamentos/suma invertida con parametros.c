#include <stdio.h>
#include <stdlib.h>

void SumaOpuesta(int Array[], int n){
    for(int i = 0; i < n ; i++){
        printf("Ingresa numero %d\n",i+1);
        scanf("%d",&Array[i]);
    }
    for(int i = 0; i < n/2; i++ ){
        printf("La suma invertida de los elementos %d y %d es %d\n",i+1,n-i,Array[i]+Array[n-i-1]);
    }
}

int main() {
    int num;
    int n;
    
    printf("Bienvenido a la suma opuesta\n");
    printf("Ingresa la cantidad de numeros a sumar\n");
    do{
    printf("Ten en cuenta que solo se aceptan numeros pares\n");
    scanf("%d",&num);
    
    if(num % 2 == 0){
        int Array[num];
        SumaOpuesta(Array,num); 
    }else{
        printf("Numero dado no es par\n");
    }
    }while(num % 2 != 0);
    
    return 0;
}