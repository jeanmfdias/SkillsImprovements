#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int valores[3];
    cout << "Digite três números: ";
    cin >> valores[0] >> valores[1] >> valores[2];

    sort(valores, valores + 3);

    cout << "Em ordem crescente: " << valores[0] << ", " << valores[1] << ", " << valores[2] << endl;
    return 0;
}
