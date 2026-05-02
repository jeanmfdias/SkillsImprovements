#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite um inteiro não-negativo n: ";
    cin >> n;

    if (n < 0) {
        cout << "n deve ser não-negativo." << endl;
        return 1;
    }

    long long fatorial = 1;
    for (int i = 2; i <= n; i++) {
        fatorial *= i;
    }

    cout << n << "! = " << fatorial << endl;
    return 0;
}
