#include <iostream>

using namespace std;

int main() {
    cout << "Milhares cuja raiz quadrada é a soma das duas dezenas:" << endl;
    for (int n = 1000; n <= 9999; n++) {
        int alta = n / 100;
        int baixa = n % 100;
        int soma = alta + baixa;
        if (soma * soma == n) {
            cout << n << " (raiz = " << soma << " = " << alta << " + " << baixa << ")" << endl;
        }
    }
    return 0;
}
