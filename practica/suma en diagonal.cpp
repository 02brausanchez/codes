#include <bits/stdc++.h> 
using namespace std; 
#define TAM  100

int sumaDiagonal(int Matrix[TAM][TAM], int f, int c){
    int sum = 0; 
    for(int i = 0; i < min(f,c); ++i){ //min -> de izquierda a derecha
        sum += Matrix[i][i];           //max -> de derecha a izquierda 
    }
    return sum; 
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int filas, columnas; 
    cin >> filas >> columnas; 
    int Matrix [TAM][TAM];

    for(int i = 0; i < filas; ++i){
        for(int j = 0; j < columnas; ++j){
            cin >> Matrix[i][j];
        } 
    }

    int printResult = sumaDiagonal(Matrix,filas,columnas); 
    cout << printResult << endl; 


    return 0; 
}