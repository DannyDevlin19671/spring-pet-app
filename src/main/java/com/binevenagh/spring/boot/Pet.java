package com.binevenagh.spring.boot;

/**
 * Represents a generic pet with basic behaviors.
 * Implementing classes should define the specific behavior of the pet.
 *
 * @author danieldevlin
 * @date 08/04/2025
 */
public interface Pet {

    /**
     * Retrieves the type of the pet.
     *
     * @return a `String` representing the type of the pet.
     */
    public String getType();

    /**
     * Makes a sound specific to the pet type.
     *
     * @return a `String` representing the sound made by the pet.
     */
    public String makeSound();
}