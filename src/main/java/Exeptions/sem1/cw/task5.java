package Exeptions.sem1.cw;

public class task5 {
    public static char pront(String str) throws  java.io.IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try{
            ch = pront("введите символ");
        }catch(java.io.IOException e){
            System.out.println("произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали" + ch);
    }
}
