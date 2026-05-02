#include <iostream>

using namespace std;

int main() {
    int n, j, m;
    cout << "n: ";
    cin >> n;
    cout << "j: ";
    cin >> j;
    cout << "m: ";
    cin >> m;

    int alvo = j % m;
    int impressos = 0;
    int natural = 0;
    while (impressos < n) {
        if (natural % m == alvo) {
            cout << natural;
            impressos++;
            if (impressos < n) cout << ", ";
        }
        natural++;
    }
    cout << endl;
    return 0;
}
