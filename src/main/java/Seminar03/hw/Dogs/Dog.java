package Seminar03.hw.Dogs;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{Собака " + name +
                ", порода " + breed +
                ", возраст " + age +
                '}';
    }


    @Override
    public int compareTo(Dog dog) {

            if (this.age == dog.age)
                return 0;
            else if (this.age > dog.age)
                return 1;
            else
                return -1;

    }
}




