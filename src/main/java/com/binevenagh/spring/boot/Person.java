package com.binevenagh.spring.boot;

/**
 * Represents a person who owns a pet.
 * This class contains information about the person's name and their pet.
 */
public class Person {
    private final Pet pet; // The pet owned by the person
    private final String name; // The name of the person

    /**
     * Constructs a new Person instance.
     *
     * @param name The name of the person.
     * @param pet  The pet owned by the person.
     */
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    /**
     * Retrieves the pet owned by the person.
     *
     * @return The pet instance.
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * Introduces the person and their pet.
     * Prints a message including the person's name, the type of their pet,
     * and the sound the pet makes.
     */
    public void introduce() {
        System.out.printf("Hi, I'm %s with a pet %s. My pet %s \n",
                this.name, pet.getType(), pet.makeSound());
    }
}
