<?php

declare(strict_types=1);

use PHPUnit\Framework\TestCase;
use Jean\IntegerListFromUsp\Exercicio17;

class Exercicio17Test extends TestCase
{
    public function testShouldReturnBinaryFromDecimal(): void
    {
        $exercicio17 = new Exercicio17();
        $decimal = 13;
        $binario = $exercicio17->convertDecimalToBinary($decimal);
        $this->assertEquals('1101', $binario);
    }
}
