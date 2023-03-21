package Seminar05_Phonebook_mvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook implements Iterable {
    List<Contact> phonebook = new ArrayList<>();

    public List<Contact> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(List<Contact> phonebook) {
        this.phonebook = phonebook;
    }
    public Contact getContact(Contact contact){
        if (phonebook.contains(contact)){
            return contact;
        }
        return new Contact("нет таких", "no contact","no number");
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
