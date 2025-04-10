import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void getName() {
        //Arrange
        Pet fish = new Pet("Bluppy", 2, "Goldfish");

        //Act
        String name = fish.getName();

        //Assert
        assertEquals("Bluppy", name);
    }

    @Test
    void setOwner() {
        //Arrange
        Pet dog = new Pet("Rex", 5, "Mastiff");
        Person paul = new Person("Paul", "Koopman", 25, "Male");

        //Act
        dog.setOwner(paul);
        String owner = dog.getOwner().getName();

        //Assert
        assertEquals("Paul", owner);
    }

    @Test
    void getSpecies() {
        //Arrange
        Pet cat = new Pet("Fluffy", 12, "Siamese");

        //Act
        String species = cat.getSpecies();

        //Assert
        assertEquals("Siamese", species);
    }

    @Test
    void getAge() {
        //Arrange
        Pet bird = new Pet("Polly", 21, "Parrot");

        //Act
        int age = bird.getAge();

        //Assert
        assertEquals(21, age);
    }
}