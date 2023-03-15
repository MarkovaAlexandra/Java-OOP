package Seminar04;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    List<T> vendinglist = new ArrayList<T>();

    void uploadGoods(List<T> vendinglist) {
        this.vendinglist = vendinglist;
    }

    /**
     * @param target название
     * @param cost   максимальная цена
     */
    void getProductByNamePrice(String target, double cost) {
        for (T t : vendinglist) {
            if (t.getName().equals(target) && t.getPrice() <= cost) {
                System.out.println(t);
            }
        }
    }

    /**
     * @param cost максимальная цена
     */
    void getAllProductsCheaperThat(double cost) {
        for (T t : vendinglist) {
            if (t.getPrice() <= cost) {
                System.out.println(t);
            }
        }
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "vendinglist=" + vendinglist +
                '}';
    }
}
