# Library Design Patterns Lab

This is a simple Java project for a Library Management System lab.
By Ahmed Ibrahim Elemam

## Patterns used
1. Singleton -> `LibraryService`
2. Factory -> `BookFactory`
3. Decorator -> `PremiumBook`
4. Chain of Responsibility -> `Librarian`, `Manager`, `Director`
5. Facade -> `LibraryFacade`
6. Adapter -> `BookAdapter`
7. Observer -> `NotifiableBook`

## Requirements mapping
- One `LibraryService` only -> Singleton
- Create different book types outside client code -> Factory
- Add extra 10 days for premium books without changing `Book` -> Decorator
- Premium access for ebooks -> Decorator
- Borrowing requests go through Librarian then Manager then Director -> Chain of Responsibility
- Simplify borrowing steps -> Facade
- Convert external JSON-like data to our book object -> Adapter
- Notify users when books become available -> Observer

## Run
Compile:
```bash
javac src/*.java
```

Run:
```bash
java -cp src Main
```
