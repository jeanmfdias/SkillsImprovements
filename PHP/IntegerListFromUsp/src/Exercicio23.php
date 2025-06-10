<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio23
{
    public function ehPalindromo(int $numero): bool
    {
        if ($numero < 10) {
            throw new \Exception("Informe um número maior que 10");
        }
        $charNumero = (string) $numero;
        $tamanhoNumero = strlen($charNumero);

        for ($i = 0; $i < $tamanhoNumero / 2; $i++) {
            if ($charNumero[$i] !== $charNumero[$tamanhoNumero - ($i + 1)]) {
                return false;
            }
        }
        return true;
    }
}
