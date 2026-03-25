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
1. Singleton -> `LibraryService`
2. Factory Method -> `BookFactory`
3. Decorator -> `BookDecorator`, `PremiumBook`
4. Chain of Responsibility -> `Approver`, `Librarian`, `Manager`, `Director`
5. Facade -> `LibraryFacade`
6. Adapter -> `BookAdapter`
7. Observer -> `Observer`, `Subject`, `NotifiableBook`

## Run
Compile:
```bash
javac src/*.java
```

Run:
```bash
java -cp src Main
```
