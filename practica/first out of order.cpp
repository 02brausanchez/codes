#include <bits/stdc++.h>
using namespace std;

void insertionSort(int list[], int listLenght){
    int firstOutOfOrder, location;
    int temp; 

    for(firstOutOfOrder = 1; firstOutOfOrder < listLenght; firstOutOfOrder++){
        if(list[firstOutOfOrder] < list[firstOutOfOrder -1]){
            temp = list[firstOutOfOrder]; 
            location = firstOutOfOrder; 
            do{
                list[location] = list[location -1];
                location--; 
            }while(location > 0 && list[location -1] > temp);
            list[location] = temp;
        }
    }
}


int main(){
    ios_base::sync_with_stdio; cout.tie(0); cin.tie(0);
    int list[] = {10,18,25,30,23,17,45,35};
    insertionSort(list,8);

    for(int i = 0; i < 8; i++){
        cout << list[i] <<endl;
    }


    return 0;
}