<?php

require_once __DIR__ . '/vendor/autoload.php';

use Jean\Scripts\Download;

$download = new Download();
$download->downloadImagesFromUrl('http://www.url.com', __DIR__ . '/tmp/');
