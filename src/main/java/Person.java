import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> sibling = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pet;

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getSibling() {
        return sibling;
    }

    public void setSibling(List<Person> sibling) {
        this.sibling = sibling;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPet() {
        return this.pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addParents(Person father, Person mother) {
        setFather(father);
        setMother(mother);
    }

    public void addChild(Person child){
        if(!getChildren().contains(child))
        {
            getChildren().add(child);
        }
    }

    public void addSibling(Person sibling){
        this.sibling.add(sibling);
    }

    public void addPet(Person person, Pet pet){
        List<Pet> pets = new ArrayList<>();
        if(person.getPet() != null){
            pets.addAll(person.getPet());
        }
        pets.add(pet);
        person.setPet(pets);
    }

    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();
        for (Person children : getChildren()) {
            grandChildren.addAll(children.getChildren());
        }
        return grandChildren;
    }
}
