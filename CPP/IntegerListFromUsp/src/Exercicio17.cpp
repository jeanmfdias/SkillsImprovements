#include <iostream>
#include <string>

using namespace std;

int main() {
    long long n;
    cout << "Digite um número decimal não-negativo: ";
    cin >> n;

    if (n < 0) {
        cout << "Número deve ser não-negativo." << endl;
        return 1;
    }

    if (n == 0) {
        cout << "Binário: 0" << endl;
        return 0;
    }

    string binario;
    while (n > 0) {
        binario.insert(binario.begin(), char('0' + (n % 2)));
        n /= 2;
    }

    cout << "Binário: " << binario << endl;
    return 0;
}
