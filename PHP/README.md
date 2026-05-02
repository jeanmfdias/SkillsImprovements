# Skills in PHP

PHP sandbox — broker integrations, utility scripts, and the USP integer-exercise list.

## Toolchain

- PHP 8 (pinned via [../mise.toml](../mise.toml))
- Dependency manager: Composer
- Test framework: PHPUnit (`^12`)
- External services: Docker Compose (Redis, RabbitMQ, Kafka)

## Project shape

Every subproject follows the same layout:

```
<Project>/
├── composer.json / composer.lock
├── src/                # PSR-4 namespace Jean\<Project>\
├── tests/              # PSR-4 namespace Jean\<Project>\Tests\
├── phpunit.xml
├── docker-compose.yml  # when external services are needed
└── README.md
```

## Subprojects

- [ConnectKafka/](ConnectKafka/) — produce/consume messages with Apache Kafka via `rdkafka`.
- [ConnectRabbitMQ/](ConnectRabbitMQ/) — publish/subscribe to RabbitMQ via `php-amqplib`.
- [ConnectRedis/](ConnectRedis/) — Redis pub/sub publisher and subscriber.
- [Scripts/](Scripts/) — standalone utilities (`Download` web scraping, `Recursion`).
- [IntegerListFromUsp/](IntegerListFromUsp/) — the [USP integer-exercise list](https://www.ime.usp.br/~macmulti/exercicios/inteiros/index.html), exercises 16–25.

## Build & run

Per subproject:

```
cd ConnectRedis
composer install
docker compose up redis php_subscriber       # see each project's README for service names
vendor/bin/phpunit
```
