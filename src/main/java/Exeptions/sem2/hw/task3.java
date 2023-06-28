package Exeptions.sem2.hw;
/*
__________________________________________________________________________________________________________---
Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
"Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
"Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
"Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением
"Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static int user_num() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Это не число");
            return user_num();
        }

    }

    public static int first_user_num() throws NumberOutOfRangeException {
        int first_num = user_num();
        if (first_num > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        return first_num;
    }

    public static int second_user_num() throws NumberOutOfRangeException {
        int second_num = user_num();
        if (second_num < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        return second_num;
    }

    public static int third_user_num() throws DivByZeroException {
        int third_num = user_num();
        if (third_num == 0) {
            throw new DivByZeroException("Деление на ноль недопустимо");
        }
        return third_num;
    }

    public static int user_sum(int a, int b) throws NumberSumException, NumberOutOfRangeException {

        if (a + b < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        return a + b;
    }

    public static void main(String[] args) {
        while (true) {

        try {
            int first = first_user_num();
            System.out.println("first ok");
            int second = second_user_num();
            System.out.println("second ok");
            int sum = user_sum(first, second);
            System.out.println("Sum ok");
            int third = third_user_num();
            System.out.println("Third ok");
            System.out.println("Проверка пройдена успешно");
            break;
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (NumberSumException e) {
            System.out.println(e.getMessage());
        } catch (DivByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
}
class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException(String message){
        super(message);
    }
}
class NumberSumException extends  Exception{
    public NumberSumException(String message){
        super(message);
    }
}

class DivByZeroException extends Exception{
    public DivByZeroException (String message){

        super(message);
    }
}