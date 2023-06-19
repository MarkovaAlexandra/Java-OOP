package algorithms_1;

public class hw_1 {public static void sort(int[] some_list) {
    for (int i = some_list.length / 2 - 1; i >= 0; i--)
        heapify(some_list, some_list.length, i);

    for (int i = some_list.length - 1; i >= 0; i--) {
        int temp = some_list[0];
        some_list[0] = some_list[i];
        some_list[i] = temp;

        heapify(some_list, i, 0);
    }
}

    private static void heapify(int[] list, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && list[leftChild] > list[largest])
            largest = leftChild;
        if (rightChild < heapSize && list[rightChild] > list[largest])
            largest = rightChild;
        if (largest != rootIndex) {
            int temp = list[rootIndex];
            list[rootIndex] = list[largest];
            list[largest] = temp;
            heapify(list, heapSize, largest);
        }
    }


    public static void main(String[] args) {
        int [] my_list  = new int [] {4,8,6,7,78,810,10,45,14,0};
        for (int i = 0; i < my_list.length; i++){
            System.out.println(my_list[i]);
        }
        sort(my_list);
        for (int i = 0; i < my_list.length; i++){
            System.out.println(my_list[i]);
        }
    }
}
