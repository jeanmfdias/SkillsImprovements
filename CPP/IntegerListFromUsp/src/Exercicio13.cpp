#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite um inteiro positivo n: ";
    cin >> n;

    int soma = 0;
    for (int divisor = 1; divisor < n; divisor++) {
        if (n % divisor == 0) {
            soma += divisor;
        }
    }

    cout << n << (soma == n ? " é perfeito." : " não é perfeito.") << endl;
    return 0;
}
