<?php

require_once __DIR__ . '/vendor/autoload.php';

use Jean\Scripts\Download;

$path = "";

$download = new Download();
$download->downloadImagesFromUrl($path, __DIR__ . '/tmp/');
