#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Digite um inteiro positivo n: ";
    cin >> n;

    cout << "Os " << n << " primeiros naturais ímpares: ";
    for (int i = 0; i < n; i++) {
        cout << (2 * i + 1);
        if (i < n - 1) cout << ", ";
    }
    cout << endl;
    return 0;
}
