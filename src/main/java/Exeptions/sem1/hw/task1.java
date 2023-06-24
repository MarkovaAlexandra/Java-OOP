package Exeptions.sem1.hw;

import java.util.Scanner;

/*
Простая задача 1: Проверка деления на ноль
Напишите программу, которая запрашивает у пользователя два целых числа
и выполняет их деление. Если второе число равно нулю, выбросите исключение
ArithmeticException с сообщением "Деление на ноль недопустимо".
Иначе выведите результат деления на экран.
 */
public class task1 {


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            try {
                System.out.println(a + " / " + b + " = " + a / b);
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Devided by zero is permitted");
            }
        }
    }


