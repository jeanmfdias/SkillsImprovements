<?php

declare(strict_types=1);

use PHPUnit\Framework\TestCase;
use Jean\IntegerListFromUsp\Exercicio18;

class Exercicio18Test extends TestCase
{
    public function testShouldReturnTrueIfTriangleIsRightAngled(): void
    {
        $exercicio18 = new Exercicio18();
        $a = 3;
        $b = 4;
        $c = 5;

        $resultado = $exercicio18->verificarSeEhTrianguloRetangulo($a, $b, $c);

        $this->assertTrue($resultado);
    }

    public function testShouldReturnFalseIfTriangleIsNotRightAngled(): void
    {
        $exercicio18 = new Exercicio18();
        $a = 3;
        $b = 4;
        $c = 6;

        $resultado = $exercicio18->verificarSeEhTrianguloRetangulo($a, $b, $c);

        $this->assertFalse($resultado);
    }
}
