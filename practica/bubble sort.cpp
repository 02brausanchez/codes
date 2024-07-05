#include <bits/stdc++.h>
using namespace std;

void bubbleSort(int list[], int lenght){
    int temp; 
    int iteration; 
    int index; 
    for(iteration = 1; iteration < lenght; iteration++){
        for(index = 0; index < lenght-iteration; index++){
            if(list[index] > list[index + 1]){
                temp = list[index]; 
                list[index]= list[index + 1]; 
                list[index + 1] = temp;
            }
        }
    }
}


int main(){
    ios_base::sync_with_stdio; cin.tie(0); cout.tie(0); 
    int list[] = {2,56,34,25,73,46,89,10,5,16}; 
 
    bubbleSort(list,10); 
    cout << "After sorting the items in the list are:  "<<endl;
    for(int i = 0; i < 10; i++){
        cout << list[i] << endl;
    }

    return 0;
}