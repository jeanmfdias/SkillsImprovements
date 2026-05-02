#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Quantidade de alunos: ";
    cin >> n;

    int maior = -1;
    int menor = 101;

    for (int i = 1; i <= n; i++) {
        int nota;
        cout << "Nota do aluno " << i << ": ";
        cin >> nota;
        if (nota < 0 || nota > 100) {
            cout << "Nota inválida (0 a 100)." << endl;
            i--;
            continue;
        }
        if (nota > maior) maior = nota;
        if (nota < menor) menor = nota;
    }

    cout << "Maior nota: " << maior << endl;
    cout << "Menor nota: " << menor << endl;
    return 0;
}
