#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Quantidade de números: ";
    cin >> n;

    if (n <= 0) {
        cout << "Comprimento máximo: 0" << endl;
        return 0;
    }

    int anterior;
    cout << "Número 1: ";
    cin >> anterior;
    int atualLen = 1;
    int maiorLen = 1;

    for (int i = 2; i <= n; i++) {
        int atual;
        cout << "Número " << i << ": ";
        cin >> atual;
        if (atual > anterior) {
            atualLen++;
        } else {
            atualLen = 1;
        }
        if (atualLen > maiorLen) maiorLen = atualLen;
        anterior = atual;
    }

    cout << "Comprimento máximo do segmento crescente: " << maiorLen << endl;
    return 0;
}
