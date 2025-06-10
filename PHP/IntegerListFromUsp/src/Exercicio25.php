<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio25
{
    public function main(array $params): void
    {
        $ai = 0;
        $bi = 0;
        $a = $params['a'][$ai];
        $b = $params['b'][$bi];
        $this->printf($a, $b);
        $total = 0;
        $soma = 0;
        while ($a != 0) {
            $total += 1;
            $termo = 1;
            for ($i = 1; $i <= $b; $i++) {
                $termo *= $a;
            }
            echo "Resp = $termo\n";
            $soma += $termo;
            echo "Soma = $soma\n";
            $a = $params['a'][++$ai] ?? 0;
            $b = $params['b'][++$bi] ?? 0;
            $this->printf($a, $b);
        }
        echo "Total de pares = $total\n";
    }

    public function printf(int $a, int $b): void
    {
        echo "($a, $b)\n";
    }
}
