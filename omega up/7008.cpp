#include <bits/stdc++.h>
using namespace std; 

int main(){
    int t, b; 
    cin >> t >> b; 

    int r = (t+1)/2; 
    r += (t-r)%(b-1);

    cout << r << '\n';

    return 0;        
} 