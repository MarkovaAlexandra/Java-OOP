package Seminar03.cw.Cats;

import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cat> {
    public List<Cat> getCatlist() {
        return catlist;
    }

    public void setCatlist(List<Cat> catlist) {
        this.catlist = catlist;
    }

    private List<Cat> catlist;

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatIterator(catlist);
    }
}
