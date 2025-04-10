import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");

        //Act
        String name = person1.getName();

        //Assert
        assertEquals("Sjaakie", name);
    }

    @Test
    void getMiddleName(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Boudewijk","Breedweg", 34, "Male");


        //Act
        String middleName = person1.getMiddleName();

        //Assert
        assertEquals("Boudewijk", middleName);
    }

    @Test
    void getLastName(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");

        //Act
        String lastName = person1.getLastName();

        //Assert
        assertEquals("Breedweg", lastName);
    }

    @Test
    void getAge(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");

        //Act
        int age = person1.getAge();

        //Assert
        assertEquals(34, age);
    }

    @Test
    void getSex(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");

        //Act
        String gender = person1.getSex();

        //Assert
        assertEquals("Male", gender);
    }

    @Test
    void getFather(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person person2 = new Person("Henk", "Richard", "Breedweg", 68, "Male");
        person1.setFather(person2);

        //Act
        Person father = person1.getFather();

        //Assert
        assertEquals(person2, father);
    }

    @Test
    void getMother(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person person2 = new Person("Beppy", "Breedweg", 63, "Female");
        person1.setMother(person2);

        //Act
        Person mother = person1.getMother();

        //Assert
        assertEquals(person2, mother);
    }
}