#include <bits/stdc++.h> 
using namespace std; 

int sumArray(int Array[], int num){
    int sum =  0;
    for(int i = 0; i < num ; ++i){
        cin >> Array[i];
        sum += Array[i]; 
    }
    return sum;
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; 
    cin >> n; 
    int Array[n]; 
    int result = sumArray(Array,n);
    cout << result << '\n';
    

    return 0;
}