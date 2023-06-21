package algorithms_3.cw;

public class Main {
    public static void main(String[] args) {

        Linlist my_list = new Linlist();
        my_list.addFirst(1);
        my_list.print();
        System.out.println();
        my_list.addLast(2);
        my_list.addLast(3);
        my_list.addLast(4);
        my_list.addLast(5);
        my_list.addFirst(0);
        my_list.print();
        my_list.removeFirst();
        my_list.removeLast();
        System.out.println();
        my_list.print();
        my_list.turn();
        System.out.println();
        my_list.print();






    }
}
