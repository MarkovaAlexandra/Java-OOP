package Exeptions.sem3.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа
 * и выполняет операцию возведения первого числа в степень второго числа.
 * Если введены некорректные числа или происходит деление на ноль, необходимо обработать
 * соответствующие исключения и вывести информативное сообщение об ошибке.
 * Важно! С использованием принципа одного уровня абстракции!
 * **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
 * выполняющий операцию возведения числа в степень.
 * Если введено некорректное основание (ноль) и отрицательная степень,
 * выбрасывается исключение InvalidInputException.
 *
 * В методе main() мы запрашиваем у пользователя основание и показатель степени,
 * вызываем метод calculatePower() и выводим результат.
 * Если введены некорректные числа или происходит ошибка ввода,
 * соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.
 *
 * Обратите внимание, что в этой задаче мы использовали собственное исключение
 * InvalidInputException, чтобы явно указать на некорректный ввод.
 * Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
 */
public class CalcStepen {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите основание степени");
            double a = sc.nextDouble();
            System.out.println("Введите показатель степени");
            double b = sc.nextDouble();
            double result = calculatePower(a,b);
            System.out.println(result);
        }
        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Это не число");
        }


    }

    public static double calculatePower(double a, double b) throws InvalidInputException{
        if (a == 0 && b < 0) {
            throw new InvalidInputException("операция не определена для таких значений");
        }
        if (a < 0 && (b - (int)b!= 0)){
            throw new InvalidInputException("операция не определена для таких значений");
        }
        else return Math.pow(a,b);
    }

    static class InvalidInputException extends  Exception{
        public InvalidInputException (String message){
            super(message);
        }
    }

}
