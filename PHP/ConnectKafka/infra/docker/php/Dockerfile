FROM php:8.4-cli

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        librdkafka-dev git \
    && pecl install rdkafka \
    && docker-php-ext-enable rdkafka \
    && curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

ENV COMPOSER_ALLOW_SUPERUSER=1

WORKDIR /app

COPY composer.json composer.lock ./
RUN composer install --no-dev --no-interaction --prefer-dist
