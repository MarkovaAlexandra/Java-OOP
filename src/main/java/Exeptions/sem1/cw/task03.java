package Exeptions.sem1.cw;

public class task03 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 16, 32, 64, 128,256, 512,2555};
        int[] arr2 = {2, 0, 2, 0, 4, 4, 0, 8};

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i] + " / " + arr2[i] + " = " + arr[i] / arr2[i]);
            } catch (ArithmeticException e) {

                System.out.println("Попытка делениея на ноль");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за пределы массива");
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e);
                System.out.println(e.getCause());

            }
        }
    }
}

