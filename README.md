# Pet App – Spring DI Example

This project demonstrates how to use Spring Core (without Spring Boot) for dependency injection. It wires up different `Pet` implementations (`Dog`, `Cat`, `Snake`) to different `Person` objects using a configuration class.

## Features

- Interface-based programming with `Pet`
- Spring `@Configuration` and `@Bean` usage
- Constructor-based injection
- Use of `@Qualifier` to resolve multiple beans
- Java 21 and Maven project setup

## Project Structure

```
pet-app
 ├── pom.xml
 └── src
     └── main
         └── java
             └── com
                 └── binevenagh
                     └── spring
                         └── boot
                             ├── App.java
                             ├── Pet.java
                             ├── Dog.java
                             ├── Cat.java
                             ├── Snake.java
                             ├── Person.java
                             └── PersonConfigurer.java
```

## How to Build and Run

Compile the project:

```
mvn clean compile
```

Run the application:

```
mvn exec:java -Dexec.mainClass="com.binevenagh.spring.boot.App"
```

## Sample Output

```
Hi, I'm Matt with a pet Dog. My pet Scooby says Woof!
Hi, I'm Kevin with a pet Cat. My pet Fluffy says Meow!
Hi, I'm Snake with a pet Snake. My pet Slippery saysssss Sssssss
```

## License

This example project is for educational use and is freely modifiable.
