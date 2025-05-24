<?php

declare(strict_types=1);

namespace Jean\ConnectRabbitMq;

use PhpAmqpLib\Connection\AMQPStreamConnection;
use PhpAmqpLib\Message\AMQPMessage;
use Throwable;

class HelloWorld
{
    public function hello(): string
    {
        return 'Hello World!';
    }

    public function sendHello(): void
    {
        $connection = new AMQPStreamConnection("localhost", 5672, "user", "password");
        $channel = $connection->channel();

        $channel->queue_declare('hello', false, false, false, false);

        $msg = new AMQPMessage('Hello World!!!');
        $channel->basic_publish($msg, '', 'hello');
        echo ' [x] Sent Hello World!' . PHP_EOL;

        $channel->close();
        $connection->close();
    }

    public function receiveHello(): void
    {
        $connection = new AMQPStreamConnection("localhost", 5672, "user", "password");
        $channel = $connection->channel();
        $channel->queue_declare('hello', false, false, false, false);
        echo ' [*] Waiting for messages. To exit press CTRL+C' . PHP_EOL;
        $callback = function ($msg) {
            echo ' [x] Received ', $msg->body, PHP_EOL;
        };
        $channel->basic_consume('hello', '', false, true, false, false, $callback);
        try {
            $channel->consume();
        } catch (Throwable $e) {
            echo $e->getMessage() . PHP_EOL;
        }
    }
}