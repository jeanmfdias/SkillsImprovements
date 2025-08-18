<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio22;
use PHPUnit\Framework\TestCase;

class Exercicio22Test extends TestCase
{
    public function testShouldReturnTheGreaterSequenceAscendant(): void
    {
        $exercicio22 = new Exercicio22();
        $resultado = $exercicio22->algoritmo([5, 10, 3, 2, 4, 7, 9, 8, 5]);
        $this->assertEquals(4, $resultado);
    }
}
