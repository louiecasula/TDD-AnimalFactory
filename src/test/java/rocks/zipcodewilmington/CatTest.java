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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Meowy";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat("Meowy", null, null);
        String expected = "meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();

        // When (a cat's name is set to the given name)
        cat.setBirthDate(givenBirthDate);

        // Then (we expect to get the given name from the cat)
        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(catBirthDate, givenBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        cat.eat(food);

        Integer expected = 1;

        // When
        Integer actual = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Cat cat1 = new Cat(null, null, 9007);

        Integer expected = null;
        Integer expected1 = 9007;


        // When
        Integer actual = cat.getId();
        Integer actual1 = cat1.getId();


        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // Given
        Cat cat = new Cat(null, null, null);

        boolean expected = true;

        // When
        boolean actual = cat instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        // Given
        Cat cat = new Cat(null, null, null);

        boolean expected = true;

        // When
        boolean actual = cat instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
