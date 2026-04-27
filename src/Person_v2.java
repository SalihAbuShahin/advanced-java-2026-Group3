import java.io.Serializable;

public class Person implements Serializable {

    private  String name;
    private  transient int age;
    public static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
