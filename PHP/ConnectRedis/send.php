<?php

require_once './vendor/autoload.php';

$publisher = new \Jean\ConnectRedis\Publisher();

for ($i = 0; $i < 10; $i++) {
    $publisher->publish('ConnectRedis', 'Message' . $i);
    echo "[Sent] Message" . $i . PHP_EOL;
}
