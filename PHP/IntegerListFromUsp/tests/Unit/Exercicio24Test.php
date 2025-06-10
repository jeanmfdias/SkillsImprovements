<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio24;
use PHPUnit\Framework\TestCase;

class Exercicio24Test extends TestCase
{
    public function testShouldReturnTrue(): void
    {
        $exercicio24 = new Exercicio24();
        $result = $exercicio24->ehSubnumero(23, 57238);
        $this->assertTrue($result);
    }

    public function testShouldReturnFalse(): void
    {
        $exercicio24 = new Exercicio24();
        $result = $exercicio24->ehSubnumero(23, 258347);
        $this->assertFalse($result);
    }
}
