# Lista de Exercícios de Inteiros da USP

[Link](https://www.ime.usp.br/~macmulti/exercicios/inteiros/index.html)

All exercises were done with PHP 8.4

16. Dado um número natural na base binária, transformá-lo para a base decimal.
17. Dado um número natural na base decimal, transformá-lo para a base binária.
18. Dados três números naturais, verificar se eles formam os lados de um triângulo retângulo.
19. Dados três números, imprimi-los em ordem crescente.
20. Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz quadrada seja a soma das dezenas formadas pela divisão acima. Exemplo: raiz de 9801 = 99 = 98 + 01. Portanto 9801 é um dos números a ser impresso.
21. Dados n e uma seqüência de n números inteiros, determinar quantos segmentos de números iguais consecutivos compõem essa seqüência.


    Exemplo: A seguinte seqüência é formada por 5 segmentos de números iguais:   5,  2,  2,  3,  4,  4,  4,  4,  1,  1

22. Dados n e uma seqüência de n números inteiros, determinar o comprimento de um segmento crescente de comprimento máximo.


    Exemplos:
    Na seqüência   5,  10,  3,  2,  4,  7,  9,  8,  5   o comprimento do segmento crescente máximo é 4.
    Na seqüência   10,  8,  7,  5,  2   o comprimento de um segmento crescente máximo é 1.

23. Dizemos que um número natural n é palíndromo (3) se o 1º algarismo de n é igual ao seu último algarismo, o 2º algarismo de n é igual ao penúltimo algarismo, e assim sucessivamente.
    

    Exemplos:
    567765 e 32423 são palíndromos.
    567675 não é palíndromo.
    Dado um número natural   n > 10 , verificar se n é palíndrome.

24. São dados dois números inteiros positivos p e q, sendo que o número de dígitos de p é menor ou igual ao número de dígitos de q. Verificar se p é um subnúmero de q.


    Exemplos:
    p = 23, q = 57238, p é subnúmero de q.
    p = 23, q = 258347, p não é subnúmero de q.

25.  Simule a execução do programa abaixo destacando a sua saída:

```c
    int main()
    {
        int a, b, total, soma, termo, i;

        printf("Digite um par de numeros: ");
        scanf("%d %d", &a, &b);
        printf("(%d, %d)\n", a, b);
        total = 0;
        soma  = 0;
        while (a != 0) {
            total = total + 1;
            termo = 1;
            for (i = 1; i <= b; i++)
                termo = termo * a;
            printf("Resp = %d\n", termo);
            soma = soma + termo;
            printf("Soma = %d\n", soma);
            printf("Digite um par de numeros: ");
            scanf("%d %d", &a, &b);
            printf("(%d, %d)\n", a, b);
        }
        printf("Total de pares: %d\n", total);
        return 0;
    }
```
Dados:
2    3
5    2
7    1
0    5
3    2
