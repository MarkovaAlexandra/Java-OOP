package Exeptions.sem1.cw;

public class task04 {
    // специально сгенерированные исключения (самостоятельно генерируемые)
    public static void main(String[] args) {
        try{
            System.out.println("До оператора throw");
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("исключение перехвачено");
        }
        System.out.println("После блогка кэтч");
    }
}
