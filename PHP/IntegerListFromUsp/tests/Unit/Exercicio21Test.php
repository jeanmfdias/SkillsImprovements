<?php

declare(strict_types=1);

use Jean\IntegerListFromUsp\Exercicio21;
use PHPUnit\Framework\TestCase;

class Exercicio21Test extends TestCase
{
    public function testShouldReturnCountBySequence(): void
    {
        $execicio21 = new Exercicio21();
        $seq = [5, 2, 2, 3, 1, 4, 4, 3, 5, 1, 2, 3, 4, 5];
        $result = $execicio21->algoritmo($seq);
        $this->assertEquals(2, $result);
    }
}
