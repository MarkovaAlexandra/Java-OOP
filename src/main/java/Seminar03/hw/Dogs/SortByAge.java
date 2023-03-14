package Seminar03.hw.Dogs;

import java.util.Comparator;

/**
 * Сортировка по возрасту по возрастанию
 */
public class SortByAge implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        if(dog1.getAge()==dog2.getAge())
        return 0;
        if (dog1.getAge()>dog2.getAge())
            return 1;
        return -1;
    }
}
