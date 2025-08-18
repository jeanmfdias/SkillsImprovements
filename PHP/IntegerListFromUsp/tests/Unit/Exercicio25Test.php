<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio25;
use PHPUnit\Framework\TestCase;

class Exercicio25Test extends TestCase
{
    public function testMain(): void
    {
        $exercicio25 = new Exercicio25();
        $params = [
            'a' => [
                2, 5, 7, 0, 3
            ],
            'b' => [
                3, 2, 1, 5, 2
            ]
        ];

        $this->expectOutputString("(2, 3)\nResp = 8\nSoma = 8\n(5, 2)\nResp = 25\nSoma = 33\n(7, 1)\nResp = 7\nSoma = 40\n(0, 5)\nTotal de pares = 3\n");

        $exercicio25->main($params);
    }

    public function testSouldEchoAStringOnPrintf(): void
    {
        $exercicio25 = new Exercicio25();
        $this->expectOutputString("(2, 3)\n");
        $exercicio25->printf(2, 3);
    }
}
