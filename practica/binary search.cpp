#include <bits/stdc++.h>
using namespace std;

int binarySearch(const int list[], int listLength, int searchItem){
    int first = 0;
    int last = listLength-1; 
    int mid;
    bool found = false;
    while(first <= last && !found){
        mid = (first + last)/2; 
        if(list[mid] == searchItem)
            found = true;
        else if(list[mid] > searchItem)
            last = mid-1;
        else
            first = mid+1;    
    }
    if(found)
        return mid;
    else
        return -1;
}

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int list[] = {4,8,19,25,34,39,45,48,66,75,89,95};
    int index = binarySearch(list,12,75);
   
    if(index != -1)
        cout << "yes, " << index << endl;
    else
        cout << "-1" << endl;
    return 0;

}