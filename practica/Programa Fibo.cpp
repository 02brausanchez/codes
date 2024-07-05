# include <bits/stdc++.h>
using namespace std;
using lli = long long int;

// Función para verificar si un número es un número de Fibonacci
bool esFibonacci(lli num) {
    lli a = 0;
    lli b = 1;
    while (b < num) {
        lli temp = b;
        b = a + b;
        a = temp;
    }
    return b == num;
}

void modula(long long int & i, lli num) {
    i %= num; // Realiza la operación de módulo
}

int main() {
    lli num;
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cout << "Ingrese un numero: " << endl;
    cin >> num;

    if (esFibonacci(num)) {
        cout << num << " es un numero de Fibonacci." << endl;
    } else {
        cout << num << " no es un numero de Fibonacci." << endl;
    }

    return 0;
}