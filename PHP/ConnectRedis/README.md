# How to run:


## Terminal 1 — start Redis + subscriber

``docker compose up redis php_subscriber``

## Terminal 2 — send messages

``docker compose run --rm php_publisher``