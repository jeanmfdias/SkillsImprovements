<?php

declare(strict_types=1);

namespace Jean\Scripts;

use DOMDocument;
use RuntimeException;

class Download
{
    public function downloadImagesFromUrl(string $url, string $basePath): void
    {
        $this->createDirectory($basePath);
        $this->createDirectory($basePath . "images/");

        $path = $this->saveHtmlFile($basePath, $url);

        $html = file_get_contents($path);
        if ($html === false) {
            throw new RuntimeException("Failed to read the file at $path");
        }
        $dom = new DOMDocument();
        libxml_use_internal_errors(true);
        $dom->loadHTML($html);
        libxml_clear_errors();
        
        $total = $this->getTotalImages($dom);
        $i = 1;
        foreach ($dom->getElementsByTagName('a') as $a) {
            if ($a->hasAttribute('class') && $a->getAttribute('class') === 'rel-link') {
                $href = $a->getAttribute('href');
                $this->downloadImage($basePath, $href, $total, $i);
            }
        }
    }

    private function createDirectory(string $path): void
    {
        if (!is_dir($path)) {
            mkdir($path, 0777, true);
        }
    }

    private function downloadImage($basePath, $href, $total, &$i): void
    {
        if (preg_match('/\.(jpg|jpeg|png|gif)$/i', $href)) {
            $imagePath = $basePath . "images/" . basename($href);
            if (!file_exists($imagePath)) {
                $imageCh = curl_init($href);
                $imageFp = fopen($imagePath, 'wb');

                curl_setopt($imageCh, CURLOPT_FILE, $imageFp);
                curl_setopt($imageCh, CURLOPT_HEADER, 0);

                if (curl_exec($imageCh) === false) {
                    throw new RuntimeException("Failed to download image from $href: " . curl_error($imageCh));
                }

                curl_close($imageCh);
                fclose($imageFp);
                echo "$i/$total...\n";
                $i++;
            } else {
                echo "Image already exists: $imagePath\n";
            }
        }
    }

    private function getTotalImages($dom): int
    {
        $total = 0;
        foreach ($dom->getElementsByTagName('a') as $a) {
            if ($a->hasAttribute('class') && $a->getAttribute('class') === 'rel-link') {
                $total++;
            }
        }
        if ($total === 0) {
            throw new RuntimeException("No links found with class 'rel-link' in the HTML content.");
        }
        echo "Total links found: $total\n";
        return $total;
    }

    private function saveHtmlFile($basePath, $url): string
    {
        $path = $basePath . "file.html";
        $ch = curl_init($url);
        $fp = fopen($path, 'wb');

        curl_setopt($ch, CURLOPT_FILE, $fp);
        curl_setopt($ch, CURLOPT_HEADER, 0);

        curl_exec($ch);
        curl_close($ch);
        fclose($fp);

        return $path;
    }
}
