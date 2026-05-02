#include <iostream>
#include <string>

using namespace std;

int main() {
    long long p, q;
    cout << "Digite p: ";
    cin >> p;
    cout << "Digite q: ";
    cin >> q;

    string sp = to_string(p);
    string sq = to_string(q);

    if (sp.size() > sq.size()) {
        cout << "p tem mais dígitos que q." << endl;
        return 1;
    }

    bool subnumero = sq.find(sp) != string::npos;
    cout << p << (subnumero ? " é subnúmero de " : " não é subnúmero de ") << q << "." << endl;
    return 0;
}
