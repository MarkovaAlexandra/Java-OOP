package Seminar03.cw.Cats;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatlist(List.of(new Cat("Barsik"),new Cat("Mursik"),new Cat("Vasik")));
        System.out.println((cats.iterator().next()));

    }
}
