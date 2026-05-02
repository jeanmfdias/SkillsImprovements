#include <iostream>
#include <string>

using namespace std;

int main() {
    string binario;
    cout << "Digite um número binário: ";
    cin >> binario;

    long long decimal = 0;
    for (size_t i = 0; i < binario.size(); i++) {
        char c = binario[i];
        if (c != '0' && c != '1') {
            cout << "Entrada inválida." << endl;
            return 1;
        }
        decimal = decimal * 2 + (c - '0');
    }

    cout << "Decimal: " << decimal << endl;
    return 0;
}
