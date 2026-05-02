#include <iostream>

using namespace std;

int main() {
    const int dias = 31;
    int maiorVenda = -1;
    int diaMaior = 0;

    for (int dia = 1; dia <= dias; dia++) {
        int vendas;
        cout << "Vendas do dia " << dia << ": ";
        cin >> vendas;
        if (vendas > maiorVenda) {
            maiorVenda = vendas;
            diaMaior = dia;
        }
    }

    cout << "Maior venda no dia " << diaMaior << " com " << maiorVenda << " discos." << endl;
    return 0;
}
