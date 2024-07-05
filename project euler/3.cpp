#include <bits/stdc++.h>
using namespace std;

// Función para calcular los factores primos
vector<int> greatestPrimeSieve(long long n) {
    vector<int> gp(n + 1);
    iota(gp.begin(), gp.end(), 0);
    for (long long i = 2; i <= n; i++) {
        if (gp[i] == i) {
            for (long long j = 2 * i; j <= n; j += i) {
                gp[j] = i;
            }
        }
    }
    return gp;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    long long num = 600851475143LL; // El número dado

    // Calculamos los factores primos
    vector<int> factors = greatestPrimeSieve(sqrt(num));

    // Encontramos el factor primo más grande
    int largestPrimeFactor = 1;
    for (long long i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {
            while (num % i == 0) {
                num /= i;
            }
            largestPrimeFactor = i;
        }
    }

    // Si num es mayor que 1 en este punto, entonces num es un factor primo más grande que sqrt(num)
    if (num > 1) {
        largestPrimeFactor = max(largestPrimeFactor, (int)num);
    }

    cout << largestPrimeFactor << "\n";

    return 0;
}