# C++ development skill

Base steps to follow when changing files under `./CPP`.

## Environment

- Compiler: `c++` / `g++`.
- Standard: C++11 (set by `CXXFLAGS` in [CPP/Makefile](../CPP/Makefile)).
- Build system: a single `Makefile` at the root of `./CPP` with a pattern rule that turns each `.cpp` into a `.out` binary.

## Project layout

Flat — every program lives directly under `./CPP/<name>.cpp` and compiles to `./CPP/<name>.out`. There are no headers, libraries, or subdirectories. Existing programs (`helloWorld.cpp`, `guessingGame.cpp`, `hangmanGame.cpp`, `bankingAccount.cpp`) are self-contained `int main()` files.

## Base steps before changing code

1. `cd` into `./CPP`.
2. Confirm the toolchain: `c++ --version`.
3. Read the target `.cpp` file end-to-end before editing — programs are self-contained and short.

## Base steps while changing code

1. Keep each program self-contained in a single `.cpp` file with its own `int main()`.
2. Match the existing style: `#include <...>` standard headers, `using namespace std;` at the top, lowercase camelCase filenames.
3. Use only the C++11 standard library — no third-party dependencies.
4. Do not introduce headers (`.hpp`/`.h`) or split a program across files unless the task requires it; the Makefile pattern rule assumes one `.cpp` per binary.

## Base steps after changing code

1. Build with the Makefile: `make <name>` (e.g. `make helloWorld`) — produces `<name>.out`.
2. Run the binary: `./<name>.out`.
3. Clean build artifacts before committing: `make clean`.
4. Do not commit `*.out` files.
