#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite um inteiro positivo n: ";
    cin >> n;

    if (n < 2) {
        cout << n << " não é primo." << endl;
        return 0;
    }

    bool primo = true;
    for (int divisor = 2; divisor * divisor <= n; divisor++) {
        if (n % divisor == 0) {
            primo = false;
            break;
        }
    }

    cout << n << (primo ? " é primo." : " não é primo.") << endl;
    return 0;
}
