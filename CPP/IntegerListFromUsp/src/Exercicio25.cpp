#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int pares[][2] = {{2, 3}, {5, 2}, {7, 1}, {0, 5}, {3, 2}};
    int idx = 0;

    int a = pares[idx][0];
    int b = pares[idx][1];
    printf("(%d, %d)\n", a, b);

    int total = 0;
    int soma = 0;
    while (a != 0) {
        total = total + 1;
        int termo = 1;
        for (int i = 1; i <= b; i++) {
            termo = termo * a;
        }
        printf("Resp = %d\n", termo);
        soma = soma + termo;
        printf("Soma = %d\n", soma);
        idx++;
        a = pares[idx][0];
        b = pares[idx][1];
        printf("(%d, %d)\n", a, b);
    }
    printf("Total de pares: %d\n", total);
    return 0;
}
