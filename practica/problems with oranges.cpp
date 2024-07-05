#include <bits/stdc++.h>
using namespace std; 
/*
    Un tendero coloco naranjas en una pila piramidal. Si la capa 
    inferior es rectangular con 10 hileras de 16 naranjas y en la 
    capa supeior tiene una sola hilera de naranjas.¿Cuantas naranjas hay en la
    pila? 
*/

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int totalOranges; 
    int sum = 0;
         
     for(int i  = 10 ; i >= 1; i--){
        totalOranges = 16 * i; 
        sum += totalOranges;
    }
    
    cout <<" case 1: "<< sum << endl; 
    sum = 0;
    
    // cuando la capa inferior tiene 50 hileras de 60 naranjas.  
    for(int i  = 50 ; i >= 1; i--){
        totalOranges = 60 * i; 
        sum += totalOranges;
    }
    
    cout <<" case 2: "<< sum << endl;
    
    return 0;

}