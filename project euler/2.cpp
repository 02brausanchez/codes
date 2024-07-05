#include <bits/stdc++.h>
using namespace std;
using lli = long long int;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    lli a = 0, b = 1;
    lli sum = 1;
    lli sumf = 0;

    while (sum <= 4000000) {
        if (sum % 2 == 0) {
            sumf += sum;
        }
        sum = a + b;
        a = b;
        b = sum;
    }

    cout << sumf << endl;

    return 0;
}