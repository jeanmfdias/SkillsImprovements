#include <iostream>

using namespace std;

int main() {
    long long n;
    cout << "Digite um inteiro não-negativo n: ";
    cin >> n;

    bool triangular = false;
    for (long long k = 0; k * (k + 1) * (k + 2) <= n; k++) {
        if (k * (k + 1) * (k + 2) == n) {
            triangular = true;
            cout << n << " é triangular: " << k << " * " << (k + 1) << " * " << (k + 2) << " = " << n << endl;
            break;
        }
    }

    if (!triangular) {
        cout << n << " não é triangular." << endl;
    }
    return 0;
}
