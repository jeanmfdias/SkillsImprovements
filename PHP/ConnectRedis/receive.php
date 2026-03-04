<?php

require_once './vendor/autoload.php';

$subscriber = new \Jean\ConnectRedis\Subscriber();

$subscriber->consume('ConnectRedis');
