package Seminar01.Task2;

public class HotDrinks extends Goods{
    private String name;
    private int price;
    private int temperature;
    private double volume;

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", temperature=" + temperature +
                ", volume=" + volume +
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public HotDrinks(String name, int price, int temperature, double volume) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }
}
