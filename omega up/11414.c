#include <stdio.h>
#include <stdlib.h> 

int main() {
    int n;
    scanf("%d", &n); 
    
    if(n % 2 != 0){
        printf("-1\n");
        return 0; 
    }
    
    int Array[n]; 
    
    for(int i = 0; i < n; i++){
        scanf("%d", &Array[i]); 
    }
    
    int sum = 0; 
    for(int i = 0; i < n/2; i++){
        sum = Array[i] + Array[n-i-1];
        printf("%d ", sum); 
    }
    
    return 0;
}