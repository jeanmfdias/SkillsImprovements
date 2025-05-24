<?php

declare(strict_types=1);

namespace Jean\IntergerListFromUsp;

class Exercicio16
{
    public function coverterBinarioParaDecimal($binario): int
    {
        $decimal = 0;
        $potencia = strlen($binario) - 1;

        for ($i = 0; $i < strlen($binario); $i++) {
            $decimal += (int) $binario[$i] * pow(2, $potencia);
            $potencia--;
        }

        return $decimal;
    }
}
