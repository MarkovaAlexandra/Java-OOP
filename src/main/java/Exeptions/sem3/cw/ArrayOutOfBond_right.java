package Exeptions.sem3.cw;

public class task1 {

    //ГДЕ ОБРАБАТЫВАТЬ ИСКЛЮЧЕНИЯ
    // так не верно



//    public static void main(String[] args) {
//        int [] array = {1,2,3,4,5};
//        int element = getElementByIndex(array, 8);
//        System.out.println("значение элемента: " + element);
//    }
//    public static int getElementByIndex(int [] array, int index){
//        try{
//            return array[index];
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("выход за пределы массива");
//        }
//        return 0;
//    }

    // верное так
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        try{
            int element = getElementByIndex(array, 8);
            System.out.println("значение элемента: " + element);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("выход за пределы массива");
        }

    }
    public static int getElementByIndex(int [] array, int index){
        return array[index];
    }
}
