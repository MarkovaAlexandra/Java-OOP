package Seminar01.Task2;

public class Water extends Goods{
private String name;
private int price;

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Water(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
