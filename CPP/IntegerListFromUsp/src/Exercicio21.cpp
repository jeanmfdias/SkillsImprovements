#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Quantidade de números: ";
    cin >> n;

    if (n <= 0) {
        cout << "Segmentos: 0" << endl;
        return 0;
    }

    int anterior;
    cout << "Número 1: ";
    cin >> anterior;
    int segmentos = 1;

    for (int i = 2; i <= n; i++) {
        int atual;
        cout << "Número " << i << ": ";
        cin >> atual;
        if (atual != anterior) {
            segmentos++;
        }
        anterior = atual;
    }

    cout << "Segmentos: " << segmentos << endl;
    return 0;
}
