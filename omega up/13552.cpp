#include <bits/stdc++.h>
using namespace std; 
using lli = long long int; 
int main(){
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    lli ns; 
    cin >> ns; 
    lli sg = (ns*(ns+1))/2; 
    lli kn; 
    lli sum_kn = 0; 
    lli nf; 

    for (int i = 0; i < ns-1; i++){
        cin >> kn; 
        sum_kn += kn;     
    }

    nf = sg-sum_kn; 
    cout << nf << endl; 
    

    return 0; 
}