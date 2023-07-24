package Exeptions.sem2.cw;

public class task1 {
    public static void main(String[] args) {
        String name = null;
        //System.out.println(name.length());             // NullPointerException

        String number = "123";
        int numberint = Integer.parseInt(number);
        System.out.println(numberint);                   // Ok
        String number1 = "123qew";
        //int numberint1 = Integer.parseInt(number1);      // NumberFormatException
        //System.out.println(numberint1);

    }
}
