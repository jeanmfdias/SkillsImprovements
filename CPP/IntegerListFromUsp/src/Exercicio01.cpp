#include <iostream>

using namespace std;

int main() {
    int numero = -1;
    while (numero != 0) {
        cout << "Digite um número (0 para sair): ";
        cin >> numero;
        if (numero != 0) {
            cout << "O quadrado de " << numero << " é " << numero * numero << endl;
        }
    }
    return 0;
}
