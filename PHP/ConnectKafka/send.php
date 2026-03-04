<?php

require_once './vendor/autoload.php';

$producer = new \Jean\ConnectKafka\Producer();

$topic = $producer->createTopic('ConnectKafkaProject');

for ($i = 0; $i < 10; $i++) {
    $producer->createMessage($topic, 'Message' . $i);
    echo "[Sent] Message" . $i . PHP_EOL;
}

$producer->flush();
