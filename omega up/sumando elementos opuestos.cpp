#include <bits/stdc++.h>
using namespace std; 

void SumaInversa(){
    int n; 
    cout << "Dame el Size del arreglo que tiene que ser par: "<<endl;
    cin >> n; 
    vector<int> Arreglo(n);
    if(n % 2 == 0){
        for (int i = 0; i < n; i++){
            cout << "Ingresa numero " << i + 1 <<endl;
            cin >> Arreglo[i];
        }
        for (int i = 0; i < n/2; i++){
            cout << "La suma de los elementos " << i+1 << " y " << n-i << " es " << Arreglo[i] + Arreglo[n-i-1] << endl;
        }
    }else{
        cout << "tu numero no es par"<<endl;
    }
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    SumaInversa();
    return 0;
}