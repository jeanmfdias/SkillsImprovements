<?php

require_once './vendor/autoload.php';

$receive = new \Jean\ConnectKafka\Consumer();

$receive->subscribe('ConnectKafka');

while (true) {
    $receive->showMessage();
}
