# Skills in C++

C++ sandbox — small console programs and the USP integer-exercise list.

## Toolchain

- Compiler: `c++` / `g++`
- Standard: C++11 (set by `CXXFLAGS` in [Makefile](Makefile))
- Build system: a single root [Makefile](Makefile) with a pattern rule that turns each `.cpp` into a `.out` binary.

## Top-level programs

Flat layout — every program is self-contained in its own `.cpp` file with its own `int main()`:

- [helloWorld.cpp](helloWorld.cpp) — first program
- [guessingGame.cpp](guessingGame.cpp) — number-guessing game
- [hangmanGame.cpp](hangmanGame.cpp) — hangman game
- [bankingAccount.cpp](bankingAccount.cpp) — banking-account simulation

## Build & run

```
make helloWorld          # compiles helloWorld.cpp -> helloWorld.out
./helloWorld.out
make clean               # remove every *.out
```

Or directly: `g++ helloWorld.cpp -o helloWorld.out`.

## Subprojects

- [IntegerListFromUsp/](IntegerListFromUsp/) — the [USP integer-exercise list](https://www.ime.usp.br/~macmulti/exercicios/inteiros/index.html) (25 exercises). Has its own `Makefile` and `src/` directory.
