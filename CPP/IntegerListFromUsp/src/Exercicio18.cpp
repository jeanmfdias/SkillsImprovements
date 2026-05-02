#include <iostream>

using namespace std;

bool ehRetangulo(long long a, long long b, long long c) {
    return a * a + b * b == c * c;
}

int main() {
    long long a, b, c;
    cout << "Digite três naturais: ";
    cin >> a >> b >> c;

    bool retangulo = ehRetangulo(a, b, c) || ehRetangulo(a, c, b) || ehRetangulo(b, c, a);

    cout << "Os números " << (retangulo ? "formam" : "não formam") << " um triângulo retângulo." << endl;
    return 0;
}
