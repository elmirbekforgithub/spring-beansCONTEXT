package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    private String name;

    private int age;

    private AnimalsCage animalsCage;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
        return
                "name= " + name + " age= " + age;
    }
}