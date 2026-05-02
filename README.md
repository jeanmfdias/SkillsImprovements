# Skills Improvements

Personal study repository — language sandboxes, course exercises, and small samples used to practice and compare patterns across languages.

The repo is organised by language. Each language root has its own README with toolchain details, and every subproject has a README explaining what it does and how to run it.

## Languages

- [C++](CPP/README.md) — small console programs and the USP integer-exercise list, compiled with `g++` (C++11).
- [Java](Java/README.md) — Alura course challenges (first app, OO, collections, APIs/files/errors, security) plus the USP integer-exercise list. Targets JDK 21.
- [PHP](PHP/README.md) — broker integrations (Kafka, RabbitMQ, Redis), utility scripts, and the USP integer-exercise list. Targets PHP 8 (managed via [mise.toml](mise.toml)).

## Cross-language exercise

`IntegerListFromUsp/` — the same [USP integer-exercise list](https://www.ime.usp.br/~macmulti/exercicios/inteiros/index.html) implemented independently in C++, Java, and PHP for side-by-side comparison.

## Layout

```
.
├── CPP/                 # C++ programs and Makefile
├── Java/                # Java modules (one IntelliJ module per subproject)
├── PHP/                 # PHP projects (one Composer project per subproject)
├── .skills/             # Per-language conventions used when editing this repo
├── CLAUDE.md            # Pointers to the .skills files
├── mise.toml            # Toolchain pinning (PHP 8)
└── README.md
```

## Progress

- [x] HelloWorld
- [x] Alura Challenges from First App in Java
- [x] Alura Challenges from Object Orientation in Java
- [x] Alura Challenges from List Collections in Java
- [x] Alura samples about Security Development in Java
- [x] Integer List from USP in C++, Java, and PHP
