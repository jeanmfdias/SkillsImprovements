<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio23;

class Exercicio23Test extends \PHPUnit\Framework\TestCase
{
    public function testShouldReturnExceptioBecauseLessThanTen(): void
    {
        $exercicio23 = new Exercicio23();
        $this->expectException(\Exception::class);
        $this->expectExceptionMessage('Informe um número maior que 10');

        $exercicio23->ehPalindromo(5);
    }

    public function testShouldReturnFalse(): void
    {
        $exercicio23 = new Exercicio23();
        $result = $exercicio23->ehPalindromo(567675);

        $this->assertFalse($result);
    }

    public function testShouldReturnTrue(): void
    {
        $exercicio23 = new Exercicio23();
        $result = $exercicio23->ehPalindromo(567765);

        $this->assertTrue($result);
    }
}
