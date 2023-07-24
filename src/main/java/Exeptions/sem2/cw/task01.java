package Exeptions.sem2.cw;

public class task01 {
    public static void main(String[] args) {
        try{my_input(-5);
        }catch(My_Exceptions e){
            System.out.println("ошибка "+ e.getMessage());
        }

    }

    public static void my_input(int value) throws My_Exceptions {
        if (value < 0) {
            throw new My_Exceptions("Значение не может быть отрицательным");
        }
        System.out.println("обработка значения " + value);
    }
}

    class My_Exceptions extends Exception {
        public My_Exceptions(String message) {
            super(message);
        }

    }
