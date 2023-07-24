package tree.hw;

public class Tree <V extends Comparable<V>>{
    private Node root;

    public void add(V value){
        Node node = root;
        Node newNode = new Node();
        newNode.value = value;
        if(root == null){
            root = newNode;
        }
        else {
            if(node.value.compareTo(value)>0){
                node.left = newNode;
            }
            else if (node.value.compareTo(value) < 0){
                node.right = newNode;
            }
            else{
                System.out.println("Такой элемент уже есть");
            }
        }
    }
    public boolean contains(V value) {
        Node node = root;
        while (node != null) {


            if (node.value.equals(value)) {
                return true;
            } else if (node.value.compareTo(value) > 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }

    private class Node{
        private V value;
        private Node left;
        private Node right;
    }
}
