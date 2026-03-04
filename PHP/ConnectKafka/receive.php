<?php

require_once './vendor/autoload.php';

$receive = new \Jean\ConnectKafka\Consumer();

$receive->subscribe('ConnectKafkaProject');

while (true) {
    $receive->showMessage();
}
