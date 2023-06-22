package tree.cw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedBlackTree rbtree = new RedBlackTree();
        Scanner sc = new Scanner(System.in);
        while(true) {

            int value = sc.nextInt();
            rbtree.add(value);
            System.out.println("Ok");

        }

    }
}
