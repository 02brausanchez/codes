#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false), cin.tie(0);
    int n; 
    cin >> n; 
    vector <int> Array(n); 
    for(int i = 0; i < n; i++){
        cin >> Array[i]; 
    } 
    int tt; 
    cin >> tt;

    for(int i = 0; i < n; i++){
        if(Array[i] % tt == 0){
            cout << Array[i] <<" ";  
        }else{
            cout << "X ";
        }
    }

    return 0; 
}