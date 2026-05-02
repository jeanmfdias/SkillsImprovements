#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite um inteiro positivo n: ";
    cin >> n;

    long long soma = 0;
    for (int i = 1; i <= n; i++) {
        soma += i;
    }
    cout << "Soma dos " << n << " primeiros inteiros positivos: " << soma << endl;
    return 0;
}
