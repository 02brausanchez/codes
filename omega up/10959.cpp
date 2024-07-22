/*
input 1         output 1
5 5             6 5 4 10
1 3 4 3 1
3 4 1 4 4
4 2 4 1 4
2 1 1 4 2
4 2 4 3 2  

input 2         output 2
6 7             3 8 7 5 7 4 4 4
1 6 8 3 5 3 9
3 6 2 7 9 2 2
8 5 3 9 6 2 1
1 6 3 7 8 3 2
9 2 5 7 2 5 6
6 2 8 3 5 6 7

*/

#include <bits/stdc++.h>
using namespace std;
#define TAM 100 

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int tt, m; 
    cin >> tt >> m; 

    vector<int> count(TAM, 0);  
    int matrix[TAM][TAM];

    for (int i = 0; i < tt; i++) {
        for (int j = 0; j < m; j++) {
            cin >> matrix[i][j];
            if (matrix[i][j] > 0 && matrix[i][j] < TAM) {
                count[matrix[i][j]]++;  
            }
        }
    }

    bool first = true;
    for (int i = 1; i < TAM; i++) {
        if (count[i] > 0) {
            if (!first) {
                cout << " ";
            }
            cout << count[i];
            first = false;
        }
    }
    cout << "\n";

    return 0; 
}
