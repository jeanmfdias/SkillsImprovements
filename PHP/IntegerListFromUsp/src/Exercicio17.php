<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio17
{
    public function convertDecimalToBinary(int $decimal): string
    {
        $binario = '';
        $resultado = $decimal;

        while ($resultado > 0) {
            $resto = $resultado % 2;
            $resultado = (int) ($resultado / 2);
            $binario = $resto . $binario;
        }

        return $binario;
    }
}
