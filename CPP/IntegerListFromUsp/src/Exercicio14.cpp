#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite n: ";
    cin >> n;

    if (n <= 0) {
        cout << "n deve ser positivo." << endl;
        return 1;
    }

    long long anterior = 0;
    long long atual = 1;
    for (int i = 1; i < n; i++) {
        long long proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
    }

    cout << "Fibonacci(" << n << ") = " << atual << endl;
    return 0;
}
