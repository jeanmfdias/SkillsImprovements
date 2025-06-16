<?php

declare(strict_types=1);

namespace Jean\ConnectRabbitMq;

use Dotenv\Dotenv;
use PhpAmqpLib\Connection\AMQPStreamConnection;
use PhpAmqpLib\Message\AMQPMessage;
use Throwable;

class HelloWorld
{
    private AMQPStreamConnection $connection;

    public function __construct()
    {
        $dotenv = Dotenv::createImmutable(__DIR__ . '/../');
        $dotenv->load();
        $this->connection = new AMQPStreamConnection(
            $_ENV['RABBITMQ_HOST'],
            (int)$_ENV['RABBITMQ_PORT'],
            $_ENV['RABBITMQ_USER'],
            $_ENV['RABBITMQ_PASSWORD']
        );
    }

    public function hello(): string
    {
        return 'Hello World!';
    }

    public function sendHello(): void
    {
        $channel = $this->connection->channel();

        $channel->queue_declare('hello', false, false, false, false);

        $date = date('Y-m-d H:i:s');
        $msg = new AMQPMessage('Hello World!!! ' . $date);
        $channel->basic_publish($msg, '', 'hello');
        echo ' [x] Sent Hello World!' . PHP_EOL;

        $channel->close();
        $this->connection->close();
    }

    public function receiveHello(): void
    {
        $channel = $this->connection->channel();
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
