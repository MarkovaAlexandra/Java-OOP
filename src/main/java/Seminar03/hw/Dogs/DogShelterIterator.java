package Seminar03.hw.Dogs;

import java.util.Iterator;
import java.util.List;

public class DogShelterIterator  implements Iterator<Dog> {
    private List<Dog> dogShelterIterator;
    int index;

    public DogShelterIterator(List<Dog> dogShelter) {
      dogShelterIterator = dogShelter;
    }

    @Override
    public boolean hasNext() {

        return index < dogShelterIterator.size();
    }

    @Override
    public Dog next() {
        if(!hasNext())return null;
        return dogShelterIterator.get(index++);
    }
}
