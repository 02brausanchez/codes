#include <bits/stdc++.h> 
using namespace std; 

int main(){
    int s1 = 0; int s2 = 1; int s3 = 1; 
    int n;
    scanf("%d", &n); 

    for(int i = 0; i < n ; i++){
        s3 = s1 + s2;
        printf("%d ", s3); 
        s1 = s2; 
        s2 = s3; 
    }

    return 0;
}
