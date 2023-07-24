package Lec03.Ex01;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
