package Seminar06.hw;

public class Professor extends Human{
    public String name;
    public int birthYear;
    public String gender;
    public String subject;
    public int salary;
    public boolean vacation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", gender='" + gender + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                ", vacation=" + vacation +
                '}';
    }
}
