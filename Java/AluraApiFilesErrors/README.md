# Alura — APIs, Arquivos e Tratamento de Erros

Course exercises consuming public HTTP APIs, parsing JSON with Gson, and handling errors with a custom exception.

## What it does

`Main` runs four scenarios end-to-end:

1. [CoinGecko.java](src/CoinGecko.java) — list coins and fetch a single coin (`bitcoin`); response is parsed into [Coin.java](src/models/Coin.java).
2. [TheMealDb.java](src/TheMealDb.java) — search recipes (`pizza`); response parsed into [Recipes.java](src/models/Recipes.java) and [Recipe.java](src/models/Recipe.java) using `@SerializedName`.
3. [GoogleBooks.java](src/GoogleBooks.java) — search books (`clean code`).
4. Password validation reading from stdin; throws [InvalidPasswordException.java](src/exceptions/InvalidPasswordException.java) when shorter than 8 characters and prints a friendly message.

## Dependencies

- JDK 21
- [Gson 2.11.0](../libs/gson-2.11.0.jar) (referenced by the IntelliJ module)

## Run

```
javac -cp ../libs/gson-2.11.0.jar -d out src/*.java src/**/*.java
java -cp out:../libs/gson-2.11.0.jar Main
```
