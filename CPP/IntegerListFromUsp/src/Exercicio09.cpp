#include <iostream>

using namespace std;

int main() {
    int n, i, j;
    cout << "n: ";
    cin >> n;
    cout << "i: ";
    cin >> i;
    cout << "j: ";
    cin >> j;

    int impressos = 0;
    int natural = 0;
    while (impressos < n) {
        if (natural % i == 0 || natural % j == 0) {
            cout << natural;
            impressos++;
            if (impressos < n) cout << ", ";
        }
        natural++;
    }
    cout << endl;
    return 0;
}
