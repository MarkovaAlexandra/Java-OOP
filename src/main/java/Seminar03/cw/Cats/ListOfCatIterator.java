package Seminar03.cw.Cats;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catlistIterator;
    private int counter;
    public ListOfCatIterator(List<Cat> catlist){
        catlistIterator = catlist;
    }
    @Override
    public boolean hasNext() {
        return counter< catlistIterator.size()-1;
    }

    @Override
    public Cat next() {
        if(!hasNext()) return null;
        counter ++;
        return catlistIterator.get(counter);
    }
}
