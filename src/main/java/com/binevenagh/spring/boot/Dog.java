package com.binevenagh.spring.boot;

/**
 * Represents a Dog, which is a type of Pet.
 * A Dog has a name and can make a sound.
 *
 * @author danieldevlin
 * @date 08/04/2025
 * @project pet-app
 */
public class Dog implements Pet {

    private String name;

    /**
     * Constructs a Dog with the specified name.
     *
     * @param name the name of the dog
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Makes a sound specific to the Dog.
     *
     * @return a string representing the sound the dog makes
     */
    @Override
    public String makeSound() {
        return String.format("%s says Woof!", name);
    }

    /**
     * Gets the type of this Pet.
     *
     * @return a string representing the type of the pet
     */
    @Override
    public String getType() {
        return "Dog";
    }
}
