<?php

declare(strict_types=1);

namespace Jean\ConnectRabbitMq\Infra;

use Dotenv\Dotenv;
use PhpAmqpLib\Connection\AMQPStreamConnection;

class RabbitMQConnect
{
    public function connect(): ?AMQPStreamConnection
    {
        try {
            $dotenv = Dotenv::createImmutable(__DIR__ . '/../../');
            $dotenv->load();
            return new AMQPStreamConnection(
                $_ENV['RABBITMQ_HOST'],
                (int)$_ENV['RABBITMQ_PORT'],
                $_ENV['RABBITMQ_USER'],
                $_ENV['RABBITMQ_PASSWORD']
            );
        } catch (\Throwable $e) {
            echo $e->getMessage();
        }
        return null;
    }
}
