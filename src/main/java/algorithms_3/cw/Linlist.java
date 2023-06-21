package algorithms_3.cw;

public class Linlist {
    private Node head; // указатель на первый элемент
    private Node tail; // указатель на последний элемент

    private class Node{
        private int value;
        private Node next; // указатель на следующий элемент
    }
    public void addFirst(int value){
        Node node = new Node(); // создаем новый элемент
        node.value = value;     // инициализиурем значение
        if (head != null){      // если список не пуст
            node.next = head;   // наш элемент встает в начале и ссылвется на бывший первый
            head = node;        // головой становится наш элемент
            return;
        }
        head = node;
        tail = node;
    }
    public void removeFirst(){
        if (head == null){
            System.out.println("Нельзя удалить элемент из пустого списка");
        }
        else{
            head = head.next;  // головой становится элемент, на который ссылалась голова
        }
    }
    public void addLast( int value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }


    public void removeLast(){
        if (head == null){
            System.out.println("недьзя удалить элемент из пустого списка");
        }
        else{
            Node node = head;
            Node last = tail;
            while(node != null){
                if(node.next == last){
                    node.next = null;
                    node = tail;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }
    public boolean contains (int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public void turn(){
        if (head!=null && head.next != null){
            tail = head;                     //в tail кладем head
            Node current = head.next;        // создаем новый элемент и кладем в него наш бывший первый
            head.next = null;                // ссылаться он будем на нулл (поскольку стал последним)
            while (current != null){         // пошли по списку
                Node next = current.next;    // создаем нов элемент и кладем в него следующий
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
    public void print(){
        if(head == null){
            System.out.println("Список пуст");
            return;
        }
        Node node = head;
        while(node!= null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }
}
