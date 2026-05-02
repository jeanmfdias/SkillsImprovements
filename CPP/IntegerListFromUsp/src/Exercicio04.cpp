#include <iostream>

using namespace std;

int main() {
    int x, n;
    cout << "Digite x: ";
    cin >> x;
    cout << "Digite n (não-negativo): ";
    cin >> n;

    if (n < 0) {
        cout << "n deve ser não-negativo." << endl;
        return 1;
    }

    long long resultado = 1;
    for (int i = 0; i < n; i++) {
        resultado *= x;
    }
    cout << x << "^" << n << " = " << resultado << endl;
    return 0;
}
