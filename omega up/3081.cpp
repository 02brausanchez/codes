#include <bits/stdc++.h>
using namespace std; 

int main(){ 
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n; 
    cin >> n; 
    int Array[n]; 

    for(int i = 0; i < n; i++){
        cin >> Array[i]; 
    }

    for(int i = 0; i < n/2; i++){
        cout << Array[i] << " " << Array[i + n/2] << " "; 
    }

    // Si n es impar, imprimir el último elemento
    if(n % 2 != 0){
        cout << Array[n - 1];
    }

    return 0; 
}