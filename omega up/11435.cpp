#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    /*operadores ternarios
    cout << (a < b ? "true" : "false") << endl;
    cout << (c > a ? "true" : "false") << endl;
    cout << (a == b ? "true" : "false") << endl;
    cout << (a != c ? "true" : "false") << endl;
    cout << (c <= b ? "true" : "false") << endl;
    */
    if(a<b) cout <<"True ";
    else cout <<"False ";

    if(c>a) cout <<"True ";
    else cout <<"False ";

    if(a==b) cout <<"True ";
    else cout <<"False ";

    if(a!=c) cout <<"True ";
    else cout <<"False ";

    if(c<=b) cout <<"True ";
    else cout <<"False ";

    return 0;
}