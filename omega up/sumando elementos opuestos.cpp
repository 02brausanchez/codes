#include <bits/stdc++.h>
using namespace std; 

void SumaInversa(){
    int n; 
    cin >> n; 
    vector<int> Arreglo(n);
    if(n % 2 == 0){
        for (int i = 0; i < n; i++){
            cout <<  i + 1 <<endl;
            cin >> Arreglo[i];
        }
        for (int i = 0; i < n/2; i++){
            cout << i+1 << n-i << Arreglo[i] + Arreglo[n-i-1] << "\n";
        }
    }else{
        cout <<"-1"<<endl;
    }
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    SumaInversa();
    return 0;
}
