#include <bits/stdc++.h>
using namespace std; 

int main(){
    int n;
    cin >> n; 
    vector<int> Array(n); 

    for(int i = 0; i < n; i++){
        cin >> Array[i]; 
    }

    int min = Array[0];
    
    //encontramos los valores maximos
    for(int i = 0; i < n; i++){
        if(Array[i] < min){
            min = Array[i]; 
        }
    } 
    
    //contamos los numeros mayores 
    int contmax = 0; 
    for(int i = 0; i < n; i++){
        if(Array[i] > min){
            contmax++;
        }
    } 
    cout << contmax << endl;

    //imprimos los valores que sean mayores 
    for(int i  = 0; i < n; i++){
        if(Array[i] > min){
            cout << Array[i] << " "; 
        }
    }

    return 0; 
}