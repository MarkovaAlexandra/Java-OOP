package Seminar01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    public void initProduct (List<Product> products){
        this.products = products;
    }
    public Product getProduct (String name){
        for (Product product:products) {
            if(product.getName().equals(name)){
            return product;
            }

        }
        return new Product("not found",0);
    }
}
