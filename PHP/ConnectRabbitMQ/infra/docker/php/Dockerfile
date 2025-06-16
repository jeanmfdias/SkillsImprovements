FROM php:8.2-cli

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        libzip-dev zip unzip git libpq-dev zlib1g-dev \
    && docker-php-ext-install sockets \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*