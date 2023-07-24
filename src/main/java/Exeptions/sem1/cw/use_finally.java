package Exeptions.sem1.cw;

public class use_finally {
    public static void getExeption(int w){
        int t;
        int nums [] = new int [2];
        System.out.println("получено" + w);
        try{
            switch (w){
                case 0:
                    t = 10 / w; // сгенерировать ошибку деления на ноль
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву;
                    break;
                case 2:
                    return;// возвратиться из блока try
            }

        }catch(ArithmeticException e){
            System.out.println("Поппытка деления на ноль");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Выход за массив");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            getExeption(i);
            System.out.println();
        }
    }
}
