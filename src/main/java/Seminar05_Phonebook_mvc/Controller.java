package Seminar05_Phonebook_mvc;

import java.io.IOException;
import java.util.List;

public class Controller extends Contact{
View v = new View();
Models m = new Models();

//    Contact contact = new Contact();
public void start() throws IOException {
    PhoneBook pb = new PhoneBook();
    String result = v.userchoice();
    while (!result.equals("0")) {
        result = v.userchoice();
        switch (result) {
            case "1":
                Contact temp = v.addContactView();
                m.addContact(temp);
                break;
        case "2":
            String find = v.findContact();
            List<Contact> tocheck = m.checking(find);
            String phone = v.aceptChange(tocheck);
            m.deleteContact(phone);
            break;
            case "3":
                m.printAll();
                break;
            case "4":
                m.saveAll();
                break;
            case "5":
                String search = v.findContact();
                List<Contact> forcheck = m.checking(search);
                String phonenum = v.aceptChange(forcheck);
                List<String>newdata = v.chengingContact();
                m.changeContact(phonenum,newdata);
                break;
            case "0":
                System.out.println("завершение работы");
                break;
            default:
                System.out.println("ерунду написал");

        }
    }

}


}
