package com.binevenagh.spring.boot;

/**
 * Represents a Snake, which is a type of Pet.
 * This class implements the Pet interface.
 */
public class Snake implements Pet {
    private String name;

    /**
     * Constructs a Snake with the given name.
     *
     * @param name the name of the snake
     */
    public Snake(String name) {
        this.name = name;
    }

    /**
     * Produces the sound made by the snake.
     *
     * @return a string representing the sound made by the snake
     */
    @Override
    public String makeSound() {
        return String.format("%s saysssss Sssssss", name);
    }

    /**
     * Returns the type of this pet.
     *
     * @return a string representing the type of the pet, which is "Snake"
     */
    @Override
    public String getType() {
        return "Snake";
    }
}
