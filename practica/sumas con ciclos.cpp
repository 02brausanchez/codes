//========== DOCUMENTACION ==============
// Hacer un programa para que sumen n numeros dados por el usuario. Utilizando los 3 tipos de ciclos
// el ciclo while, ciclo for y ciclo do-while.
//
// Datos de entrada:1 2 3 4 5 6 
// Datos de salida:21
//
#include <iostream>

 int main(){
    int numero,suma, n, cont;

     // ======================== Ciclo while =============================================//
     std::cout<<" Cuantos numero quieres sumar ocupando ciclo while? "<<std::endl;
     std::cin>>n;
     suma = 0;
     cont = 1;
     while (cont <= n){
        std::cout<<" Ingresa un numero "<<std::endl;
        std::cin>>numero;
        suma = suma + numero;
        cont = cont + 1;
     }
     std::cout<<" La suma de n numeros con el ciclo while es: "<<suma<<std::endl;
     // ======================== Ciclo for =============================================//
     std::cout<<" Cuantos numero quieres sumar ocupando ciclo for? "<<std::endl;
     std::cin>>n;
     suma = 0;
     cont = 1;
     for (cont = 1; cont <= n ; cont++) {
         std::cout<<" Ingresa numero "<<cont<<std::endl;
         std::cin>>numero;
         suma = suma + numero;
     }
     std::cout<<" La suma de n numeros con el ciclo for es: "<<suma<<std::endl;
    //======================== Ciclo do- while =============================================//
     std::cout<<" Cuantos numero quieres sumar ocupando ciclo do-while? "<<std::endl;
     std::cin>>n;
     suma = 0;
     cont = 1;
     do{
         std::cout<<" Ingresa numero "<<std::endl;
         std::cin>>numero;
         suma = suma + numero;
         cont = cont + 1;
     } while (cont <= n);
     std::cout<<" La suma de n numeros con el ciclo do-while es: "<<suma<<std::endl;

     return 0;
}