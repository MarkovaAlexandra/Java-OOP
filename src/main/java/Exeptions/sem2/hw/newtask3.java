package Exeptions.sem2.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Задача3: - по желанию
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

// в этом варианте функция check проверяет сразу все четыре условия
public class newtask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("введите первое число");
                int a = sc.nextInt();
                System.out.println("введите второе число");
                int b = sc.nextInt();
                System.out.println("введите третье число");
                int c = sc.nextInt();
                check(a, b, c);
                break;
            } catch (NumberOutOfRangeException | DivisionByZeroException |
                     NumberSumException e) {

                System.out.println(e.getMessage());
                sc.nextLine();                                           // очищаем строку ввода
            } catch (InputMismatchException e) {
                System.out.println("это не число");
                sc.nextLine();                                           // очищаем строку ввода
            }
        }
    }

    public static void check(int a, int b, int c) throws NumberOutOfRangeException, DivisionByZeroException, NumberSumException {
        if (a > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        if (b < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        if (c == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        if (a + b < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        System.out.println("все ok");
    }

}
