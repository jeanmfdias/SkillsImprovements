<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio21
{
    public function algoritmo($seq): int
    {
        $cont = 0;
        $anterior = 0;
        for ($i = 0; $i < count($seq); $i++) {
            if ($seq[$i] == $anterior) {
                $cont++;
            }
            $anterior = $seq[$i];
        }

        return $cont;
    }
}
