package Seminar01.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Water bottleOfWater = new Water("bottle",100);
        List<Water> listWater = new ArrayList<>(Arrays.asList(new Water("water1",150),
                new Water("water2",100),new Water("water2",70),
                new Water("water2",105)));
        VendingMachineWater vmWater = new VendingMachineWater();

        vmWater.initGoods(listWater);

        System.out.println(vmWater.getGoods("water2"));
        System.out.println(vmWater.getGoods("water2",100));
        System.out.println("___________________________________");


        HotDrinks coffee = new HotDrinks("espresso",50,50,0.2);
        List<HotDrinks> listHdrinks = new ArrayList<>(Arrays.asList(
                new HotDrinks("espresso",70,50,0.4),
                new HotDrinks("espresso",80,50,0.5),
                new HotDrinks("espresso",75,65,0.3),
                new HotDrinks("latte",200,45,0.5),
                new HotDrinks("tea",70,80,0.5)));
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        vmHotDrinks.initGoods(listHdrinks);
        System.out.println(vmHotDrinks.getGoods("latte"));
        System.out.println(vmHotDrinks.getGoods("espresso",50,0.5));

    }
}
