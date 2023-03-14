package Seminar03.hw.Dogs;
/**
 * Сортировка по имени (по алфавиту)
 */

import java.util.Comparator;

public class SortByName implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}
