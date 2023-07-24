package Lec03.Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Worker worker = new Worker("Smith", "John", 25, 200);
        //Iterator<Object> components = worker.iterator();// не сработает
        Iterator<String> components = worker;//создали методы has next , next в классе воркер
        while (worker.hasNext()) {
            System.out.println(worker.next());
        }


         Beverage latte = new Coffe();
        latte.addcomponent(new Milk("qwe"));
        latte.addcomponent(new Milk("qwe"));
        latte.addcomponent(new Milk("qwe"));

        Iterator<Ingredient> lateeiter = latte;
        while (latte.hasNext()){
            System.out.println(latte.next());
        }
    }
}
