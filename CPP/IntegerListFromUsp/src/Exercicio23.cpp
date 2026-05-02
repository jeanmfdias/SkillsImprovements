#include <iostream>
#include <string>

using namespace std;

int main() {
    long long n;
    cout << "Digite um natural maior que 10: ";
    cin >> n;

    if (n <= 10) {
        cout << "n deve ser maior que 10." << endl;
        return 1;
    }

    string s = to_string(n);
    bool palindromo = true;
    for (size_t i = 0; i < s.size() / 2; i++) {
        if (s[i] != s[s.size() - 1 - i]) {
            palindromo = false;
            break;
        }
    }

    cout << n << (palindromo ? " é palíndromo." : " não é palíndromo.") << endl;
    return 0;
}
