package Exeptions.sem1.cw;

public class Main {
    public static void main(String[] args) {
    task01();


}
    public static void task01(){
        int[] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            System.out.println(nums[6]);
            System.out.println(",jhbkjn");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
        System.out.println("После catch");
    }


}