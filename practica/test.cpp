#include <bits/stdc++.h>
using namespace std; 

int main(){
    ios_base::sync_with_stdio; cin.tie(0); cout.tie(0);
    /*
    case 1.
    int ages[]= {1,3,5,6,9,10,11,12,4,2,21,20,53,42,78};
    int limit = (sizeof (ages) / sizeof (ages[0]));
    for(int i = 0; i <= limit ; i++){
        cout << ages[i] << endl;
    }
    */
   
    vector <int> nums = {1,8,3,7,0,9}; 
        for(int i = 0; i < nums.size(); i++){
        cout << nums[i] <<"\n";
        }    
    
    sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            cout << nums[i] << "\n"; 
        }
        
    /* case 3.
    string titles[5]; 
    string authors[5];
    cout << "enter please the next information:";
    for(int i = 0; i < 5; i++){
        cout << "\n Book: " << i+1<<'\n'; 
        cout << "Title: ";
        getline(cin, titles[i]);
        cout << "Author: "; 
        getline(cin, authors[i]);
    }
    */

    return 0;
}