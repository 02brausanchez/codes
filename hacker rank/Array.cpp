#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false), cin.tie(0);
    int n;
    cin >> n;
    int Array[n];

    for(int i = 0; i < n; i++) {
        cin >> Array[i];
    }
    
    for(int i = n - 1; i >= 0; i--) {
        cout << Array[i] << " ";
    }

    return 0;
}

