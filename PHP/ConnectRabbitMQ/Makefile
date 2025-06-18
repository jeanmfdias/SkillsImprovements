lint:
	docker run --rm -v ${PWD}/:/app ghcr.io/phpstan/phpstan analyse src tests

test:
	docker compose exec -it app_send composer test

ci: lint test