<?php

use Jean\ConnectRabbitMq\HelloWorld;
use PHPUnit\Framework\TestCase;

class HelloWorldTest extends TestCase
{
    public function testShouldReturnHelloWorld(): void
    {
        $helloWorld = new HelloWorld();
        $result = $helloWorld->hello();
        $this->assertEquals('Hello World!', $result);
    }
}
