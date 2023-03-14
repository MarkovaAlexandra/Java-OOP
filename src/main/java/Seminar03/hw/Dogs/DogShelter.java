package Seminar03.hw.Dogs;

import java.util.*;

public class DogShelter implements Iterable<Dog> {
    public List<Dog> dogShelter;

    public List<Dog> getDogShelter() {
        return dogShelter;
    }


    @Override
    public String toString() {
        return "DogShelter{" +
                "dogShelter=" + dogShelter +
                '}';
    }

    public void setDogShelter(List<Dog> dogShelter) {

        this.dogShelter = dogShelter;
    }



    @Override
    public Iterator<Dog> iterator() {
        return new DogShelterIterator(dogShelter);
    }


}





