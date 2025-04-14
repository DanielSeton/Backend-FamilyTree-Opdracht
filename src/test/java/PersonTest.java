import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void getChilderen() {
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person child1 = new Person("Henkie", "Breedweg", 12, "Male");
        Person child2 = new Person("Eefje", "Breedweg", 8, "Female");
        Person child3 = new Person("Bobby", "Breedweg", 10, "Male");

        List<Person> kids = new ArrayList<Person>();
        kids.add(child1);
        kids.add(child2);
        kids.add(child3);
        person1.setChildren(kids);

        //Act
        List<Person> children = person1.getChildren();

        //Assert
        assertEquals(kids, children);
    }

    @Test
    void getSiblings(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person sibling1 = new Person("Suzanne", "Breedweg", 48, "Female");
        Person sibling2 = new Person("Bebby", "Breedweg", 35, "Female");
        Person sibling3 = new Person("Dave", "Breedweg", 42, "Male");

        List<Person> sibs = new ArrayList<Person>();
        sibs.add(sibling1);
        sibs.add(sibling2);
        sibs.add(sibling3);
        person1.setSibling(sibs);

        //Act
        List<Person> sibling = person1.getSibling();

        //Assert
        assertEquals(sibs, sibling);
    }

    @Test
    void addParents(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person person2 = new Person("Henk", "Richard", "Breedweg", 68, "Male");
        Person person3 = new Person("Beppy", "Breedweg", 63, "Female");

        //Act
        person1.addParents(person2, person3);
        Person mother = person1.getMother();
        Person father = person1.getFather();

        //Assert
        assertEquals(person2, father);
        assertEquals(person3, mother);
    }

    @Test
    void addSibling(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Person sibling1 = new Person("Suzanne", "Breedweg", 48, "Female");
        List<Person> sibs = new ArrayList<>();
        sibs.add(sibling1);

        //Act
        person1.addSibling(sibling1);

        //Assert
        assertEquals(sibs, person1.getSibling());
    }

    @Test
    void addChildren(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 54, "Male");
        Person child = new Person("Henkie", "Breedweg", 32, "Male");
        person1.addChild(child);


        //Act
        List<Person> children = person1.getChildren();

        //Assert
        assertTrue(children.size() > 0);
    }

    @Test
    void addPet(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 34, "Male");
        Pet dog = new Pet("Fikkie", 3, "dog");
        Pet cat = new Pet("Kyra", 4, "cat");
        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);

        //Act
        person1.addPet(person1, cat);
        person1.addPet(person1, dog);

        //Assert
        assertEquals(pets, person1.getPet());
    }


    @Test
    void addGrandChildren(){
        //Arrange
        Person person1 = new Person("Sjaakie", "Breedweg", 54, "Male");
        Person child = new Person("Henkie", "Breedweg", 32, "Male");
        Person grandChild = new Person("Jamie","Breedweg", 1, "Male");
        person1.addChild(child);
        child.addChild(grandChild);


        //Act
        List<Person> grandchildren = person1.getGrandChildren();

        //Assert
        assertTrue(grandchildren.size() > 0);
    }
}
