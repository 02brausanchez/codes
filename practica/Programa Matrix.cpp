#include <bits/stdc++.h>
using namespace std; 

const int RENGS = 4;
 const int COLS = 5;

 void Inicializa_matriz(int matriz[][COLS], int nr, int nc) {
    srand(time(0));
    for (int i = 0; i < nr; i++) {
        for (int j = 0; j < nc; j++) {
            matriz[i][j] = rand() % 50;
        }
    }
}

 void Despliega_matriz(const char* msje, int matriz[][COLS], int nr, int nc) {
    cout << msje;
    for (int i = 0; i < nr; i++) {
        for (int j = 0; j < nc; j++) {
            cout << " " << matriz[i][j] << " ";
        }
        cout <<"\n";
    }
    cout <<"\n";
 }

 int main() {
    int mat1[RENGS][COLS];
    Inicializa_matriz(mat1, RENGS, COLS);
    Despliega_matriz("Mat1 =", mat1, RENGS, COLS);
    return 0;
 }