package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        // Given
        Dog dog = AnimalFactory.createDog("Barky", null);
        String expectedName = "Barky";
        Date expectedBirthDate = null;

        // When
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        // Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedName, actualName);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        // Given
        Cat cat = AnimalFactory.createCat("Meowy", null);
        String expectedName = "Meowy";
        Date expectedBirthDate = null;

        // When
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedName, actualName);
    }
}
