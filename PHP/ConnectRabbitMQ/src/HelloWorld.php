<?php

declare(strict_types=1);

namespace Jean\ConnectRabbitMq;

use Dotenv\Dotenv;
use Jean\ConnectRabbitMq\Infra\RabbitMQConnect;
use PhpAmqpLib\Connection\AMQPStreamConnection;
use PhpAmqpLib\Message\AMQPMessage;
use Throwable;

class HelloWorld
{
    private ?AMQPStreamConnection $connection;


    public function __construct(private readonly RabbitMQConnect $rabbitMQ)
    {
        $this->connection = $this->rabbitMQ->connect();
    }

    public function hello(): string
    {
        return 'Hello World!';
    }

    public function sendHello(): void
    {
        try {
            $channel = $this->connection->channel();

            $channel->queue_declare('hello', false, false, false, false);

            $date = date('Y-m-d H:i:s');
            $msg = new AMQPMessage('Hello World!!! ' . $date);
            $channel->basic_publish($msg, '', 'hello');
            echo ' [x] Sent Hello World!' . PHP_EOL;

            $channel->close();
            $this->connection->close();
        } catch (Throwable $e) {
            echo $e->getMessage() . PHP_EOL;
        }
    }

    public function receiveHello(): void
    {
        try {
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
        } catch (Throwable $e) {
            echo $e->getMessage() . PHP_EOL;
        }
    }
}
