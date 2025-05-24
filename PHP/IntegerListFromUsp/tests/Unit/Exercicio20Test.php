<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio20;
use PHPUnit\Framework\TestCase;

class Exercicio20Test extends TestCase
{
    public function testAlgoritmo(): void
    {
        $exercicio20 = new Exercicio20();
        $resultado = $exercicio20->algoritmo();

        $this->assertStringContainsString('9801', $resultado);
    }
}
