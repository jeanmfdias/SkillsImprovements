<?php

namespace Jean\Scripts;

class Recursion
{
    public function printArrayDesc(array $array): void
    {
        if (empty($array)) {
            return;
        }
        $this->printArrayDesc(array_slice($array, 1));
        echo $array[0];
    }
}