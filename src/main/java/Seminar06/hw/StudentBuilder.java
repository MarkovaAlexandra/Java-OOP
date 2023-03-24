package Seminar06.hw;



public class StudentBuilder {
    public static StudentBuilder instance = null;
    Student obj;

    public StudentBuilder() {
    }
    public static StudentBuilder getInstance(){
        if(instance == null)
            instance = new StudentBuilder();
        instance.obj = new Student();
        return instance;
    }
    public StudentBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public StudentBuilder setBirthYear(int birthYear) {
        obj.setBirthYear(birthYear);
        return this;
    }


    public StudentBuilder setGender(String gender) {
        obj.setGender(gender);
        return this;
    }

    public StudentBuilder setPhoneNumber(int phoneNumber) {
        obj.setPhoneNumber(phoneNumber);
        return this;
    }

    public StudentBuilder setFacultet(String facultet) {
        obj.setFacultet(facultet);
        return this;
    }

      public StudentBuilder setGrants(int grants) {
        obj.setGrants(grants);
        return this;
    }

    public StudentBuilder setAverageGrade(float averageGrade) {
        obj.setAverageGrade(averageGrade);
        return this;
    }


    public Student build(){
        return obj;
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "obj=" + obj +
                '}';
    }
}

