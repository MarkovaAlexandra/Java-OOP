package Exeptions.sem2.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
 */
public class task2 {
    public static int user_num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        try{
            int num = sc.nextInt();
            return num;
        }catch (InputMismatchException e){
            System.out.println("Это не число");
            return user_num();
        }

    }
    public static int not_null_num() throws DivisionByZeroException{
        int num = user_num();
        if (num == 0){
            throw new DivisionByZeroException("Деление на ноль запрещено");
        }
        return num;
    }

    public static void main(String[] args) {
            int a = user_num();

        while(true) {
            try {
                int b = not_null_num();
                int result = a / b;
                System.out.println(a + " / "+ b + " = " + result);

                break;

            } catch (DivisionByZeroException e) {
                System.out.println("Делитель не может быть 0");
            }
        }


    }

}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException (String message){

        super(message);
    }
}