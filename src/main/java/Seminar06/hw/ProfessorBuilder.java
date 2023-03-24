package Seminar06.hw;

public class ProfessorBuilder {
    public static ProfessorBuilder instance = null;
    Professor obj;

    public static ProfessorBuilder getInstance(){
        if(instance == null)
            instance = new ProfessorBuilder();
        instance.obj = new Professor();
        return instance;
    }

    public ProfessorBuilder setName(String name) {
        obj.setName(name);
        return this;

    }

    public ProfessorBuilder setBirthYear(int birthYear) {
       obj.setBirthYear(birthYear);
        return this;
    }


    public ProfessorBuilder setGender(String gender) {
        obj.setGender(gender);
        return this;
    }

    public ProfessorBuilder setSubject(String subject) {
       obj.setSubject(subject);
        return this;
    }



    public ProfessorBuilder setSalary(int salary) {
        obj.setSalary(salary);
        return this;
    }



    public ProfessorBuilder setVacation(boolean vacation) {
        obj.setVacation(vacation);
        return this;
    }
    public Professor build(){
        return obj;
    }
}
