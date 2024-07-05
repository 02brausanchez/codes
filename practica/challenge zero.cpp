/* ======================== Reto #0 ==============================
 *
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
#include<iostream>
#include <string>

/*
int main(){

     for (int i = 1; i <= 100; ++i) {
         if (i % 3 == 0 && i % 5 == 0){
             std::cout<<"fizzbuzz! "<<i<<std::endl;
         }else if(i % 3 == 0){
             std::cout<<"fizz "<<i<<std::endl;
         }else if (i % 5 == 0){
             std::cout<<"buzz "<<i<<std::endl;
         }else {
             std::cout<<""<< i << std::endl;
         }
         }
     return 0;
     }
*/

    /* Si es divisble entre 3 saldra fizz "<<std::endl;
       Si es divisble entre 5 saldra buzz "<<std::endl;
       Si es divisble entre ambos saldra fizzbuzz "<<std::endl;
    */

    int main(){
        std::string name;
        char carrera;
        int num;
        std::cout<<" Ingrese su nombre"<<std::endl;
        std::getline(std::cin, name);

        std::cout<<" Ingresa un numero del 1 al 100 "<<std::endl;
        std::cin>>num;
            if(num % 3 == 0 && num % 5 == 0){
                std::cout<<" Tu numero es: tiktok :)"<<std::endl;
            }else if(num % 3 == 0){
                std::cout<<" Tu numero es : tik"<<std::endl;
            }else if(num % 5 == 0){
                std::cout<<" Tu numero es : tok"<<std::endl;
            }else{
                std::cout<<" Tu numero no es divisble entre 5 ni entre 3 :("<<std::endl;
            }
        return 0;
        }