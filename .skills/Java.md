# Java development skill

Base steps to follow when changing files under `./Java`.

## Environment

- Java version: JDK 21 (referenced in each `.iml` module).
- IDE: IntelliJ IDEA (each project ships an `.iml` module file).
- Build system: none — projects compile directly with `javac` / `java`.
- External jars: dropped under `Java/libs/` (e.g. `gson-2.11.0.jar`) and added to the IntelliJ module classpath.

## Project layout

Two shapes coexist under `./Java`:

- Top-level scratch code: `Java/src/*.java` with `Java/libs/` for jars.
- Per-exercise modules: `Java/<Project>/` containing `<Project>.iml` and a flat `src/` directory of `.java` files. Most files live in the default package (no `package` declaration); `Main.java` is the entry point when present.

## Base steps before changing code

1. `cd` into the target subproject (e.g. `Java/AluraChallengesObjectOrientation`).
2. Confirm the active JDK is 21 (`java -version`).
3. Skim the existing `src/` files to learn the package layout — most projects use the default package, so do not add a `package` line unless the surrounding files already use one.

## Base steps while changing code

1. Place new code under the project's `src/` directory.
2. Match the existing package convention (default package vs. named) of the file you are editing.
3. Keep one public class per file, with the filename matching the public class name.
4. Prefer explicit types and standard library APIs; only pull in jars from `Java/libs/` when needed and reference them through the IntelliJ module.
5. Use `Main.java` (or the existing entry-point class) for `public static void main` — do not create parallel entry points.

## Base steps after changing code

1. Compile from the project root: `javac -d out src/*.java` (add `-cp ../libs/<jar>` when using libraries).
2. Run the entry point: `java -cp out Main` (or the relevant class).
3. Do not commit the `out/` directory or any `.class` files.
4. Keep `.iml` files in sync if you add new source roots or libraries.
