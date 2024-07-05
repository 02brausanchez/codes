#include <bits/stdc++.h>
using namespace std;

int main() {
    int num_palabras;

    //cout << "Ingresa el numero de palabras: ";
    cin >> num_palabras;
    cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Consumir la nueva línea

    string palabra_corta = "";
    int longitud_corta = numeric_limits<int>::max(); // Valor máximo para la longitud inicial

    for (int i = 0; i < num_palabras; i++) {
        string palabra;
        //cout << "Ingresa tu palabra: ";
        getline(cin, palabra);

        if (palabra.length() < longitud_corta) {
            palabra_corta = palabra;
            longitud_corta = palabra.length();
        }
    }

    cout /*<< "La palabra más corta es: " */ << palabra_corta <<endl;
    cout /*<< "Tiene " */ << longitud_corta << /*" caracteres"*/endl;

    if (longitud_corta % 2 == 0) {
        cout << " par " << endl;
    } else {
        cout << " impar " << endl;
    }

    return 0;
}
