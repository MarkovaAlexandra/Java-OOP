import java.util.InputMismatchException;
import java.util.Scanner;

/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число
и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна
выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".

Обратите внимание, что в обоих задачах используются собственные исключения,
которые наследуются от класса Exception.
Это позволяет нам определить специфическую причину ошибки
и передать информацию об ошибке для последующей обработки.
 */
public class task1 {
    public static int user_num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        try {
            int num = sc.nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Это не число");
            return user_num();
        }
    }


    public static int user_pos_num() throws InvalidNumberException {
        int result = user_num();
        if (result <= 0) {
            throw new InvalidNumberException("Значение не может быть отрицательным");

        }
        return result;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                int my_number = user_pos_num();
                System.out.println("число корректное");
                break;
            } catch (InvalidNumberException e) {
                System.out.println("Некорректное число");
            }
        }
    }

}




class InvalidNumberException extends Exception{
    public InvalidNumberException (String message){
        super(message);
    }
}


