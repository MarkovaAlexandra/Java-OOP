package Seminar02.hw;

public abstract class  Reader {
    protected String name;
    protected int readId;
    protected String birthDate;
    protected String phone;


    public Reader(String name, int readId, String birthDate, String phone) {
        this.name = name;
        this.readId = readId;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReadId() {
        return readId;
    }

    public void setReadId(int readId) {
        this.readId = readId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
