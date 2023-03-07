package Seminar01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("cola",25),
                new Product("pepsi",45),new Product("water",15)));

        vm.initProduct(products);
        System.out.println(vm.getProduct("klkl"));
    }
}
