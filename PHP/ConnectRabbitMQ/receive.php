<?php

require_once __DIR__ . '/vendor/autoload.php';

$helloWorld = new \Jean\ConnectRabbitMq\HelloWorld();
$helloWorld->receiveHello();
