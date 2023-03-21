package Seminar05_Phonebook_mvc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Models extends PhoneBook {

    public void addContact(Contact contact) {
        // сюда переписать -> добавить, если нету
        phonebook.add(contact);
        System.out.println(phonebook.toString());

    }
    public List<Contact> checking(String find){
        List<Contact> tocheck = new ArrayList<>();
        for (Contact contact: phonebook) {
            if (contact.getFirstname().equals(find) ||
            contact.getLastname().equals(find) || contact.getPhonenumber().equals(find)){
                tocheck.add(contact);

            }

        }
        return tocheck;
    }
    public void deleteContact(String phone) {

        Contact todelete = null;
        for (Contact contact : phonebook) {
            if (contact.getPhonenumber().equals(phone)) {
                todelete = contact;
            }

        }
        phonebook.remove(todelete);
    }

    public void printAll() {
        System.out.println(phonebook.toString());
    }

    public void saveAll() {
        try (FileWriter writer = new FileWriter("base.txt", false)) {
            for (int i = 0; i < phonebook.size(); i++) {
                Contact contact = phonebook.get(i);
                writer.append(String.format(contact.getFirstname()) + " ");
                writer.append(String.format(contact.getLastname()) + " ");
                writer.append(String.format(contact.getPhonenumber()) + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void changeContact(String phonenum,List<String>newdata ){

        for (Contact contact:phonebook) {

             if (contact.getPhonenumber().equals(phonenum)) {
             String field = newdata.get(0);
             switch (field){
                 case "1":
                     contact.setFirstname(newdata.get(1));
                     break;
                 case "2":
                     contact.setLastname(newdata.get(1));
                     break;
                 case "3":
                     contact.setPhonenumber(newdata.get(1));
                     break;
             };
            }
        }
    }

}
