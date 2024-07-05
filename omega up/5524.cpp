#include <bits/stdc++.h>
using namespace std; 

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n; 
    int b; 
    cin >> n; 
    int Array[n]; 

    for(int i = 0; i < n; i++){
        cin >> Array[i]; 
    } 

    cin >> b; 
    int val_max = 0;
    for(int i = 0; i < n; i++){
        if(Array[i] == b){
            val_max++;  
        }
    }
    
    cout << val_max <<"\n"; 

    return 0; 
}