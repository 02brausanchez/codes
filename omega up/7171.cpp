#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n; 
    cin >> n;
    
    vector<int> Array(n); // Usamos un vector en lugar de un arreglo estático
    
    for(int i = 0; i < n; i++) {
        cin >> Array[i];
    }
    
    // Encontramos el máximo valor en el arreglo
    int max_valor = Array[0];
    for(int i = 1; i < n; i++) {
        if(Array[i] > max_valor) {
            max_valor = Array[i];
        }
    }
    
    // Contamos cuántos números son estrictamente menores que max_valor
    int cont_min = 0;
    for(int i = 0; i < n; i++) {
        if(Array[i] < max_valor) {
            cont_min++;
        }
    }
    
    // Imprimimos cuántos números cumplen la condición
    cout << cont_min << endl;
    
    // Imprimimos los números que son estrictamente menores que max_valor
    for(int i = 0; i < n; i++) {
        if(Array[i] < max_valor) {
            cout << Array[i] << " ";
        }
    }
    cout << endl;
    
    return 0;
}
