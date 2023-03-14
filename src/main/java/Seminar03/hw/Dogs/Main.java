package Seminar03.hw.Dogs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DogShelter dogshelter = new DogShelter();
        dogshelter.setDogShelter(Arrays.asList(new Dog("Bobik","pudel",10),
                                         new Dog("Sharik","pudel",5),
                                         new Dog("Emma", "nepudel",8),
                                         new Dog("Rex","houng",4)));

        Iterator<Dog> iter = dogshelter.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("------Вывод в порядке добавления (без сортировки)---");
        System.out.println(dogshelter.getDogShelter());

        System.out.println("------Сортировка по имени------------");
        Collections.sort(dogshelter.getDogShelter(),new SortByName());
        System.out.println(dogshelter.getDogShelter());


        System.out.println("------Сортировка по возрасту------------");
        Collections.sort(dogshelter.getDogShelter(),new SortByAge());
        System.out.println(dogshelter.getDogShelter());

        System.out.println("------------Сортировка по породе--------");
        Collections.sort(dogshelter.getDogShelter(), new SortByBreed());
        System.out.println(dogshelter.getDogShelter());
    }
}
