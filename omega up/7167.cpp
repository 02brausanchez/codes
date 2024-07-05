#include <bits/stdc++.h>
using namespace std;
using lli = long long int;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    lli n;
    lli op;
    cin >> n;
    op = n;
    lli cont = 0;
    lli max_val = n;

    while(op != 1) {
        if(op % 2 == 0){
            op = op / 2;
        }else{
            op = 3 * op + 1;
        }
        cont++;
        if(op > max_val){
            max_val = op;
        }
    }
    cout << cont << " " << max_val << endl;
    
    return 0;
}