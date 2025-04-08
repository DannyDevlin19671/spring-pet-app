package com.binevenagh.spring.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Entry point for the Spring application.
 * This class demonstrates the use of Spring beans and dependency injection
 * to create and manage `Person` and `Pet` objects.
 */
public class App
{
    /**
     * Main method to run the application.
     * It initializes the Spring context, retrieves beans, and invokes their methods.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize the Spring application context with the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfigurer.class);

        // Retrieve and use the dogPerson bean
        Person dogPerson = (Person) context.getBean("dogPerson");
        Person catPerson = (Person) context.getBean("catPerson");
        Person snakePerson = (Person) context.getBean("snakePerson");

        // Introduce each person and make their pets produce sounds
        dogPerson.introduce();
        dogPerson.getPet().makeSound();
        catPerson.introduce();
        catPerson.getPet().makeSound();
        snakePerson.introduce();
        snakePerson.getPet().makeSound();
    }
}
