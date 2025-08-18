<?php

namespace Jean\Scripts;

class Recursion
{
    public function printArrayDesc(array $array, int $i): void
    {
        if (empty($array)) {
            return;
        }
        echo $array[$i];
        $this->printArrayDesc(array_slice($array, 1), $i++);
    }
}