<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio22
{
    public function algoritmo(array $seq): int
    {
        $anterior = 0;
        $cont = 0;
        $maiorSequencia = 0;
        for ($i = 0; $i < count($seq); $i++) {
            if ($seq[$i] > $anterior) {
                $cont++;
            } else {
                if ($maiorSequencia < $cont) {
                    $maiorSequencia = $cont;
                }
                $cont = 1;
            }
            $anterior = $seq[$i];
        }
        if ($maiorSequencia < $cont) {
            $maiorSequencia = $cont;
        }
        return $maiorSequencia;
    }
}
