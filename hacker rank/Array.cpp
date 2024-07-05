#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false); // Asegúrate de llamar a la función 'false'
    cin.tie(0);
    cout.tie(0);

    int n;
    cin >> n;
    int Array[n];

    // Leer los elementos del arreglo
    for(int i = 0; i < n; i++) {
        cin >> Array[i];
    }

    // Imprimir los elementos en orden inverso
    for(int i = n - 1; i >= 0; i--) {
        cout << Array[i] << " ";
    }

    return 0;
}



/*
#include <bits/stdc++.h>
using namespace std; 

int main(){ 
    ios_base::sync_with_stdio;cin.tie(0);cout.tie(0);
    int n; 
    cin >> n; 
    int Array[n];
    for(int i = 0; i < n; i++){
        cin >> Array[i]; 
        for(int j = Array[i]-1; j > 0; j--){
            if(Array[j] == Array[i]){
                cout << j;
            }
        }
    } 

    return 0; 
}
*/