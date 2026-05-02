#include <iostream>

using namespace std;

int main() {
    int a, b;
    cout << "Digite dois inteiros positivos: ";
    cin >> a >> b;

    int original_a = a;
    int original_b = b;

    while (b != 0) {
        int resto = a % b;
        a = b;
        b = resto;
    }

    cout << "MDC(" << original_a << ", " << original_b << ") = " << a << endl;
    return 0;
}
