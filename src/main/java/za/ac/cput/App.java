package za.ac.cput;

/**
 * Hello world!
 *This program deals with Customer details
 */
public class App 
{
    private String name;
    private Integer age;

    public App (String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    public App()
    {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
