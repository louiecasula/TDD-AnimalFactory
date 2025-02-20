package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog("Barky", null, null);
        String expected = "bark!";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Dog dog = new Dog("Barky", null, null);
        Date givenBirthDate = new Date();

        // When
        dog.setBirthDate(givenBirthDate);

        // Then
        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(dogBirthDate, givenBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        dog.eat(food);

        Integer expected = 1;

        // When
        Integer actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        Dog dog = new Dog(null, null, 9998);

        Integer expected = 9998;

        // When
        Integer actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, 9998);

        boolean expected = true;

        // When
        boolean actual = dog instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void MammalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, 9998);

        boolean expected = true;

        // When
        boolean actual = dog instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }



}
