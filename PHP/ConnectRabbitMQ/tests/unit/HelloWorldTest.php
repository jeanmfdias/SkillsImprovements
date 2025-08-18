<?php

use Jean\ConnectRabbitMq\HelloWorld;
use Jean\ConnectRabbitMq\Infra\RabbitMQConnect;
use PHPUnit\Framework\TestCase;

class HelloWorldTest extends TestCase
{
    public function testShouldReturnHelloWorld(): void
    {
        $helloWorld = new HelloWorld(new RabbitMQConnect());
        $result = $helloWorld->hello();
        $this->assertEquals('Hello World!', $result);
    }
}
