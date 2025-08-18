<?php

namespace Tests\Unit;

use Jean\Scripts\Recursion;
use PHPUnit\Framework\TestCase;

class RecursionTest extends TestCase
{
    public function testPrintArrayDesc(): void
    {
        $array = ["a", "b", "c", "d", "e", "f"];

        $recursion = new Recursion();
        $recursion->printArrayDesc($array);

        $this->expectOutputString("fedcba");
    }
}