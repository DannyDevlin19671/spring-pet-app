package com.binevenagh.spring.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for creating and managing `Pet` and `Person` beans.
 */
@Configuration
public class PersonConfigurer {

    /**
     * Creates a `Dog` bean with the name "Scooby".
     *
     * @return a `Dog` instance
     */
    @Bean
    public Pet dog() {
        return new Dog("Scooby");
    }

    /**
     * Creates a `Cat` bean with the name "Fluffy".
     *
     * @return a `Cat` instance
     */
    @Bean
    public Pet cat() {
        return new Cat("Fluffy");
    }

    /**
     * Creates a `Snake` bean with the name "Slippery".
     *
     * @return a `Snake` instance
     */
    @Bean
    public Pet snake() {
        return new Snake("Slippery");
    }

    /**
     * Creates a `Person` bean named "dogPerson" associated with the `Dog` bean.
     *
     * @param dog the `Dog` bean
     * @return a `Person` instance with the `Dog` as their pet
     */
    @Bean(name = "dogPerson")
    public Person dogPerson(@Qualifier("dog") Pet dog) {
        return new Person("Matt", dog);
    }

    /**
     * Creates a `Person` bean named "catPerson" associated with the `Cat` bean.
     *
     * @param cat the `Cat` bean
     * @return a `Person` instance with the `Cat` as their pet
     */
    @Bean(name = "catPerson")
    public Person catPerson(@Qualifier("cat") Pet cat) {
        return new Person("Kevin", cat);
    }

    /**
     * Creates a `Person` bean named "snakePerson" associated with the `Snake` bean.
     *
     * @param snake the `Snake` bean
     * @return a `Person` instance with the `Snake` as their pet
     */
    @Bean(name = "snakePerson")
    public Person snakePerson(@Qualifier("snake") Pet snake) {
        return new Person("Snake", snake);
    }
}
