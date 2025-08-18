<?php

declare(strict_types=1);

use PHPUnit\Framework\TestCase;
use Jean\IntegerListFromUsp\Exercicio16;

class Exercicio16Test extends TestCase
{
    public function testShouldReturnDecimalFromBinary()
    {
        $exercicio16 = new Exercicio16();
        $binario = '1101';
        $decimal = $exercicio16->coverterBinarioParaDecimal($binario);
        $this->assertEquals(13, $decimal);
    }
}
