package tree.hw;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(45);
        tree.add(12);
        tree.add(120);
        tree.add(120);
        tree.add(45);
        System.out.println(tree);
        System.out.println(tree.contains(45));
        System.out.println(tree.contains(4));


    }
}
