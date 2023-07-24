package Exeptions.sem3.cw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter first num");
            int a = sc.nextInt();
            System.out.println("enter second num");
            int b = sc.nextInt();
            double result = check(a, b);
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("it is not a number");
        } catch (DivizionException e){
            System.out.println("operation not permitted");
        }
    }




    public static double check(int a,int b) throws DivizionException{
        if (b == 0) {
            throw new DivizionException("divizion by zero is forbidden");
        }
    return a / b;
}

    static class DivizionException extends Exception{
        public DivizionException (String message){
            super(message);
        }
    }
}
