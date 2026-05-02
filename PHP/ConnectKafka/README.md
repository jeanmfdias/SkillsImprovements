# How to run

## In terminal 1 — start Kafka + consumer

``cd ConnectKafka``

``docker compose up kafka php_consumer``

## In terminal 2 — run the producer

``docker compose run --rm php_producer``

Or start everything at once and check logs:

``docker compose up --build``

``docker compose logs php_producer   # see [Sent] messages``

``docker compose logs php_consumer   # see [Received] messages``