<?php

require_once './vendor/autoload.php';

$producer = new \Jean\ConnectKafka\Producer();

$topic = $producer->createTopic('ConnectKafka');

for ($i = 0; $i < 10; $i++) {
    $producer->createMessage($topic, 'Message' . $i);
}
