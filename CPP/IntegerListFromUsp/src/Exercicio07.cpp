#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Quantidade de números: ";
    cin >> n;

    long long soma = 0;
    for (int i = 0; i < n; i++) {
        int numero;
        cout << "Número " << (i + 1) << ": ";
        cin >> numero;
        if (numero % 2 == 0) {
            soma += numero;
        }
    }

    cout << "Soma dos pares: " << soma << endl;
    return 0;
}
