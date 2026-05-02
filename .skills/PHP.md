# PHP development skill

Base steps to follow when changing files under `./PHP`.

## Environment

- PHP version: 8 (managed via `mise`, see [mise.toml](../mise.toml)).
- Dependency manager: Composer.
- Test framework: PHPUnit (`^12.0`).
- Containers: Docker Compose for external services (Redis, RabbitMQ, Kafka).

## Project layout

Each subproject under `./PHP/<Project>` follows the same shape:

- `composer.json` / `composer.lock` — dependencies and PSR-4 autoload.
- `src/` — production code, namespace `Jean\<Project>\` (PSR-4).
- `tests/` — PHPUnit tests, namespace `Jean\<Project>\Tests\`.
- `phpunit.xml` — test configuration.
- `docker-compose.yml` + `infra/` — local services when needed.
- `README.md` — how to run the project.

## Base steps before changing code

1. `cd` into the target subproject (e.g. `PHP/ConnectRedis`).
2. Run `composer install` if `vendor/` is missing or `composer.lock` changed.
3. Read the project `README.md` to understand how to run it.
4. If the project uses Docker, start required services with `docker compose up <service>`.

## Base steps while changing code

1. Keep the PSR-4 namespace mapping consistent with `composer.json`.
2. Place production code in `src/`, tests in `tests/`.
3. Mirror the `src/` directory tree inside `tests/` and suffix test classes with `Test`.
4. Prefer typed properties, return types, and `declare(strict_types=1);` at the top of new files.
5. Use constructor injection — avoid global state and singletons.

## Base steps after changing code

1. Run the test suite from the subproject root: `vendor/bin/phpunit`.
2. If you added a dependency, commit both `composer.json` and `composer.lock`.
3. Do not commit the `vendor/` directory.
4. Update the project `README.md` if the run instructions changed.
