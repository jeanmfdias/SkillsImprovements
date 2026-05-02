# Alura — Listas e Coleções

Course exercises practicing Java collections (`ArrayList`, generics, iteration) and OO modeling.

## Classes

- [Person.java](src/Person.java), [Animal.java](src/Animal.java), [Dog.java](src/Dog.java) — basic models
- [Product.java](src/Product.java), [PerishableProduct.java](src/PerishableProduct.java), [BankAccount.java](src/BankAccount.java) — domain objects with state
- [Shape.java](src/Shape.java), [Circle.java](src/Circle.java), [Rectangle.java](src/Rectangle.java) — abstract shape hierarchy

## Entry point

[Main.java](src/Main.java) runs every challenge in sequence, building lists of people, products, and shapes and exercising the collection APIs.

## Run

```
javac -d out src/*.java
java -cp out Main
```
