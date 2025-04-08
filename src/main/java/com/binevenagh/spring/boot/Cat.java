package com.binevenagh.spring.boot;

/**
 * Represents a Cat, which is a type of Pet.
 * A Cat has a name and can make a sound.
 * Implements the Pet interface.
 */
public class Cat implements Pet {

    private String name;

    /**
     * Constructs a Cat with the specified name.
     *
     * @param name the name of the cat
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * Makes a sound specific to the Cat.
     *
     * @return a string representing the sound the cat makes
     */
    @Override
    public String makeSound() {
        return String.format("%s says Meow!", name);
    }

    /**
     * Gets the type of this Pet.
     *
     * @return a string representing the type of the pet, which is "Cat"
     */
    @Override
    public String getType() {
        return "Cat";
    }
}
