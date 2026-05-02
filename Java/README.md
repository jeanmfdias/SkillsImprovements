# Skills in Java

Java sandbox — Alura course challenges and the USP integer-exercise list.

## Toolchain

- JDK 21 (referenced in each `.iml` module).
- IntelliJ IDEA — every subproject ships an `.iml` module file.
- No build system: projects compile directly with `javac` / `java`.
- Shared third-party jars live under [libs/](libs/) (currently `gson-2.11.0.jar`) and are added to the IntelliJ module classpath.

## Top-level scratch code

- [src/Main.java](src/Main.java), [src/ExericioProvaVanessa.java](src/ExericioProvaVanessa.java) — quick experiments tied to the legacy `HelloWorld.iml` module.

## Subprojects

- [AluraChallengesFirstApp/](AluraChallengesFirstApp/) — 17 standalone first-app exercises, each with its own `main`.
- [AluraChallengesObjectOrientation/](AluraChallengesObjectOrientation/) — OO challenges 1–23: classes, inheritance, interfaces, custom exceptions, file I/O, HTTP via `java.net.http.HttpClient`, JSON serialization with Gson.
- [AluraChallengesListCollections/](AluraChallengesListCollections/) — collections practice (`ArrayList`, abstract classes, generics).
- [AluraApiFilesErrors/](AluraApiFilesErrors/) — consumes public HTTP APIs (CoinGecko, TheMealDB, Google Books), parses JSON with Gson, and demonstrates a custom exception flow.
- [SecurityDevelopment/](SecurityDevelopment/) — small security-oriented samples (currently `UploadLimitSize`).
- [IntegerListFromUsp/](IntegerListFromUsp/) — the [USP integer-exercise list](https://www.ime.usp.br/~macmulti/exercicios/inteiros/index.html), exercises 1–15.

## Build & run

Each subproject compiles with plain `javac`. Example:

```
cd AluraChallengesObjectOrientation
javac -cp ../libs/gson-2.11.0.jar -d out src/*.java
java -cp out:../libs/gson-2.11.0.jar Main      # ; instead of : on Windows
```

Subprojects without third-party dependencies skip the `-cp` flag.
