# Alura — Object Orientation Challenges

Course exercises practicing OO concepts: classes, inheritance, polymorphism, interfaces, custom exceptions, file I/O, HTTP, and JSON serialization. All challenges are wired into a single [Main.java](src/Main.java) and run sequentially.

## Highlights

- [Person.java](src/Person.java), [Student.java](src/Student.java), [BankAccount.java](src/BankAccount.java), [CurrentAccount.java](src/CurrentAccount.java) — class hierarchies
- [Animal.java](src/Animal.java), [Dog.java](src/Dog.java), [Cat.java](src/Cat.java) — abstract class + overriding
- [Saleable.java](src/Saleable.java), [Calculable.java](src/Calculable.java) — interfaces implemented by [Book.java](src/Book.java), [Product.java](src/Product.java), [GeometricCalc.java](src/GeometricCalc.java)
- [PrimeNumber.java](src/PrimeNumber.java), [PrimeVerificator.java](src/PrimeVerificator.java), [PrimeGenerator.java](src/PrimeGenerator.java), [Calculator.java](src/Calculator.java), [MultiplicationTable.java](src/MultiplicationTable.java) — algorithms

### Recent challenges (21–24)

- 21 — GitHub user lookup: [GitHubUserSearch.java](src/GitHubUserSearch.java) calls `https://api.github.com/users/<username>` with `java.net.http.HttpClient`; throws [ErroConsultaGitHubException.java](src/ErroConsultaGitHubException.java) on 404 and the `catch` block prints a friendly message.
- 22 — Write a message to `arquivo.txt` using `java.io` ([FileWriterChallenge.java](src/FileWriterChallenge.java)). The generated file is gitignored.
- 23 — Serialize a [Titulo.java](src/Titulo.java) instance to JSON with Gson.
- 24 — Serialize a [Veiculo.java](src/Veiculo.java) instance to JSON with Gson.

## Dependencies

- JDK 21
- [Gson 2.11.0](../libs/gson-2.11.0.jar) — for Challenge 23

## Run

```
javac -cp ../libs/gson-2.11.0.jar -d out src/*.java
java -cp out:../libs/gson-2.11.0.jar Main
```

Challenge 21 needs internet access. Challenge 22 writes `arquivo.txt` to the project root.
