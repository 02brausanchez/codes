#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    int Num, ContI, ContP, Total;
    ContI = 0;
    ContP = 0;
    std::cout << " Cuantos numeros genero? ";
    std::cin >> Total;

    std::srand(std::time(nullptr));

    while (Total > 0) {
        Num = std::rand() % 50;
        std::cout << "\n" << Num << std::endl;

        if (Num % 2 == 0) {
            ContP = ContP + 1;
        }
        else {
            ContI = ContI + 1;
        }

        Total = Total - 1;
    }
    std::cout << "\n" << std::endl;
    std::cout << " Hubo " << ContP << " pares \n" << std::endl;
    std::cout << " Hubo " << ContI << " impares \n" << std::endl;

    return 0;
}