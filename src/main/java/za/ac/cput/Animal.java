package za.ac.cput;
/**
 * @Author: Rick Allen Herbert
 * @Student Number: 219014337
 * @Date: 28/03/2021
 * @Description: A program that keeps track on animal information
 */
public class Animal {

    private String type;
    private int age;
    private String name;
    private String breed;

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
