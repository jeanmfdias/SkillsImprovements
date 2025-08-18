FROM php:8.4-cli

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        libzip-dev zip unzip git libpq-dev zlib1g-dev \
    && docker-php-ext-install sockets \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

RUN curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer \
    && ln -s $(composer config --global home) /root/composer
ENV PATH=$PATH:/root/composer/vendor/bin COMPOSER_ALLOW_SUPERUSER=1