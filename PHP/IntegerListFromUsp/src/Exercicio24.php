<?php

declare(strict_types=1);

namespace Jean\IntegerListFromUsp;

class Exercicio24
{
    public function ehSubnumero(int $p, int $q): bool
    {
        if (str_contains((string) $q, (string) $p)) {
            return true;
        }
        return false;
    }
}
