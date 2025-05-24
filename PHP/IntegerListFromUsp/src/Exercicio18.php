<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio18
{
    public function verificarSeEhTrianguloRetangulo(float $a, float $b, float $c): bool
    {
        if (pow($a, 2) + pow($b, 2) === pow($c, 2)) {
            return true;
        }
        return false;
    }
}
