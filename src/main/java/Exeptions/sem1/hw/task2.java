package Exeptions.sem1.hw;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Простая задача 2: Обработка некорректного ввода
Напишите программу, которая запрашивает у пользователя его возраст.
Если введенное значение не является числом,
выбросите исключение NumberFormatException с сообщением "Некорректный ввод".
Иначе выведите возраст на экран.
 */
public class task2 {

    // InputMismatchException
    public static void age1() {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        try {
            age = sc.nextInt();
            System.out.println("Ваш возраст:" + age);
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("это не возраст");
        }
    }

    // NumberFormatExeption
    public static void age2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        String age = sc.next();
        try{Integer userage =  Integer.parseInt(age);
            System.out.println("Ваш возраст: " + userage);
        }catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Это не число");
        }
    }

    public static void main(String[] args) {
        age1();
        age2();
    }
}
