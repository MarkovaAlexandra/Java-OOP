package Lec03.Ex01;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    public String firstname;
    public String lastname;
    public int age;
    public int salary;

    public Worker(String firstname, String lastname, int age, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
    int index;
    @Override
    public boolean hasNext() {
        return index++ <4;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("firstname: %s",firstname);
            case 2:
                return String.format("firstname: %s",lastname);
            case 3:
                return String.format("age: %d", age);
            default:
                return String.format("salary: %d",salary);
        }
    }
}
