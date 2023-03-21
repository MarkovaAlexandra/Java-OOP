package Seminar05_Phonebook_mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public String userchoice(){
        System.out.println("Выберите пункт меню: " +
                "1 - добавить, " +"\n"+
                "2 - удалить, " +"\n"+
                "3 - показать книгу, " +"\n"+
                "4 - сохранить в файл, " +"\n"+
                "5 - изменить контакт, "+"\n"+
                "0-выход");

        Scanner sc = new Scanner(System.in);

        String result = sc.nextLine();
        return result;

    }
    public Contact addContactView(){
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        contact.setFirstname(sc.nextLine());
        System.out.println("Введите фамилию");
        contact.setLastname(sc.nextLine());
        System.out.println("Введите телефонный номер");
        contact.setPhonenumber(sc.nextLine());
        return contact;
    }
    public String findContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомый контакт");
        String find = sc.nextLine();
        return find;
        // нужна проверка, этот ли контакт удалять, удалит первое сопадение
    }
public String aceptChange(List<Contact> toCheck){
    for (Contact contact:toCheck) {
        System.out.println(contact);
    }
    System.out.println("Введите телефонный номер искомого контакта");
    Scanner sc = new Scanner(System.in);
    String phonenumber = sc.nextLine();
    return phonenumber;

}
public List<String> chengingContact(){
        List<String >newdata = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    System.out.println("Какое поле хотите изменить?" +"\n" +
            "1 - имя"+"\n" +
            "2 - фамилия" +"\n" +
            "3 - номер телефона");
    String field = sc.nextLine();
    newdata.add(field);
    System.out.println("Введите новые данные");
        String newfield = sc.nextLine();
        newdata.add(newfield);
        return newdata;
}
}
