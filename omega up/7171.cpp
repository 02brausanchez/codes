#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n; 
    cin >> n;
    
    vector<int> Array(n); 
    
    for(int i = 0; i < n; i++) {
        cin >> Array[i];
    }

    int max_valor = Array[0];
    for(int i = 1; i < n; i++) {
        if(Array[i] > max_valor) {
            max_valor = Array[i];
        }
    }

    int cont_min = 0;
    for(int i = 0; i < n; i++) {
        if(Array[i] < max_valor) {
            cont_min++;
        }
    }

    cout << cont_min << endl;

    for(int i = 0; i < n; i++) {
        if(Array[i] < max_valor) {
            cout << Array[i] << " ";
        }
    }
    cout << "\n";
    
    return 0;
}
