#include <bits/stdc++.h>
using namespace std;

int numMax(int Array[], int num){    
    int max = Array[0];
    for(int i = 0; i < num; ++i){
        if(max < Array[i]){
            max = Array[i];
        }
    }
    return max;
}

int numMin(int Array[], int num){
    int min = Array[0];
    for(int i = 0; i < num;++i){
        if(min > Array[i]){
            min = Array[i];
        }
    } 
    return min; 
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0); 
    int n; 
    cin >> n;
    if(n <= 0 || n > 100000){
        cout << " Error: El tamaño del arreglo es invalido." << endl;
        return 1;
    } 

    int Array[n];
 
    for(int i = 0; i < n; ++i){
        cin >> Array[i];
    }

    int printMax = numMax(Array, n);
    int printMin = numMin(Array, n);

    cout <<"["<< printMin <<","<< printMax <<"]"<< "\n";   
    cout <<"\n";
    
    return 0;
}