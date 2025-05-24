<?php

use Jean\IntegerListFromUsp\Exercicio19;
use PHPUnit\Framework\TestCase;

class Exercicio19Test extends TestCase
{
    public function testShouldPrintAscOrder(): void
    {
        $exercicio19 = new Exercicio19();
        $num1 = 3;
        $num2 = 1;
        $num3 = 2;
        $resultado = $exercicio19->printAscOrder($num1, $num2, $num3);
        $this->assertEquals('1 2 3', $resultado);
    }
}
