FROM php:8.4-cli

RUN apt-get update \
    && apt-get install -y --no-install-recommends git \
    && pecl install redis \
    && docker-php-ext-enable redis \
    && curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

ENV COMPOSER_ALLOW_SUPERUSER=1

WORKDIR /app

COPY composer.json ./
RUN composer install --no-dev --no-interaction
