package Seminar04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Автомат холодных напитков----------");
        VendingMachine<ColdDrinks> vmColdDrinks = new VendingMachine<>();
        vmColdDrinks.uploadGoods(Arrays.asList(new ColdDrinks("pepsi", 70),
                new ColdDrinks("cola", 80), new ColdDrinks("water", 50),
                new ColdDrinks("fanta", 75)));
        System.out.println("--------Вывод по имени и цене(fanta,75)----------");
        vmColdDrinks.getProductByNamePrice("fanta", 75);
        System.out.println("--------Вывод продуктов,дешевле чем (74)----------");
        vmColdDrinks.getAllProductsCheaperThat(74);


        System.out.println("--------Автомат снеков----------");
        VendingMachine<Snack> vmSnack = new VendingMachine<>();
        vmSnack.uploadGoods(Arrays.asList(new Snack("chips", 70),
                new Snack("bounty", 80), new Snack("mars", 85),
                new Snack("peanuts", 100), new Snack("peanuts", 120)));
        System.out.println("--------Вывод по имени и цене (peanuts,150----------");
        vmSnack.getProductByNamePrice("peanuts", 150);


    }
}
