<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio19
{
    public function printAscOrder(int $num1, int $num2, int $num3): string
    {
        $menor = 0;
        $medio = 0;
        $maior = 0;

        for ($i = 0; $i < 3; $i++) {
            if ($num1 < $num2 && $num1 < $num3) {
                $menor = $num1;
                if ($num2 < $num3) {
                    $medio = $num2;
                    $maior = $num3;
                } else {
                    $medio = $num3;
                    $maior = $num2;
                }
            } elseif ($num2 < $num1 && $num2 < $num3) {
                $menor = $num2;
                if ($num1 < $num3) {
                    $medio = $num1;
                    $maior = $num3;
                } else {
                    $medio = $num3;
                    $maior = $num1;
                }
            } elseif ($num3 < $num1 && $num3 < $num2) {
                $menor = $num3;
                if ($num1 < $num2) {
                    $medio = $num1;
                    $maior = $num2;
                } else {
                    $medio = $num2;
                    $maior = $num1;
                }
            }
        }

        return "$menor $medio $maior";
    }
}
