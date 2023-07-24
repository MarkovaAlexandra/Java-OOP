package Lec05;

import java.util.Scanner;

public class View {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int setX() {
        System.out.println("insert x = ");
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
        return x;

    }

    public int getY() {
        return y;
    }

    public int setY() {
        System.out.println("insert y = ");
        Scanner sc = new Scanner(System.in);
        this.y = sc.nextInt();
        return y;

    }

}
