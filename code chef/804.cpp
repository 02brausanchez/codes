#include <bits/stdc++.h>
using namespace std;

map<string, char> binToChar = {
    {"00", 'A'},
    {"01", 'T'},
    {"10", 'C'},
    {"11", 'G'}
};

int main() {
    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        string s;
        cin >> s;
        
        string result;
        for (int i = 0; i < n; i += 2) {
            string binPair = s.substr(i, 2);
            result += binToChar[binPair];
        }
        
        cout << result << "\n";
    }
    
    return 0;
}


