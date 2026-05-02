# PHP Scripts

Standalone PHP utility scripts.

## Contents

- [src/Download.php](src/Download.php) — downloads an HTML page and every image referenced from `<a class="rel-link">` links into a target directory. Uses `DOMDocument` to parse the HTML.
- [src/Recursion.php](src/Recursion.php) — recursion exercises.
- [run.php](run.php) — entry point that wires `Download::downloadImagesFromUrl(...)` to a target URL and output directory.

## Setup

```
composer install
```

## Run

Edit `$path` in [run.php](run.php) to point at a source URL, then:

```
php run.php
```

Downloaded files land under `./tmp/`.

## Tests

```
vendor/bin/phpunit
```
