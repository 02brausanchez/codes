#include <bits/stdc++.h>
using namespace std; 

int main(){
    int n, a, b;
    int valor_fijo = 1000;
    int suma, Diferencia;
    suma = 0; Diferencia = 0;
    cin >> n >> a >> b; 
    for ( int i = 0;  i < 1000; i++ ){
        if(a % 2 != 0 && b % 2 != 0){ // Caso impar 
            Diferencia = (n+b)-2; // -1*(n-b) -2
           // Diferencia = Diferencia + (b+2);   
            suma = valor_fijo +Diferencia; 
        }else{                        // Caso par 
            Diferencia = ( n - a )-2; 
            suma = valor_fijo + Diferencia;
        }
    }
    cout << suma << endl; 
    return 0; 
}

