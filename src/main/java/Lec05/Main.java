package Lec05;

public class Main {
    public static void main(String[] args) {

        Button button = new Button(new View(),new Sum());
        System.out.println( button.buttonclick());
        System.out.println( button.buttonclick());
        System.out.println( button.buttonclick());
        System.out.println( button.buttonclick());

    }
}
