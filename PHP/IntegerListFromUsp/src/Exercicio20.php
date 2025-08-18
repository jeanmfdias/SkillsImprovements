<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio20
{
    public function algoritmo(): string
    {
        $resultado = '';
        for ($i = 1000; $i <= 9999; $i++) {
            $numero = (string) $i;
            $primeiraDezena = (int) ($numero[0] . $numero[1]);
            $segundaDezena = (int) ($numero[2] . $numero[3]);

            $raiz = sqrt($i);

            if ($raiz == ($primeiraDezena + $segundaDezena)) {
                $resultado .= $numero . ' ';
            }
        }
        return $resultado;
    }
}
