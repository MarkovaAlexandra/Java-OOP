package Seminar05_Phonebook_mvc;

public class Contact {
    String firstname;
    String lastname;
    String phonenumber;

    public Contact() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Contact(String firstname, String lastname, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
