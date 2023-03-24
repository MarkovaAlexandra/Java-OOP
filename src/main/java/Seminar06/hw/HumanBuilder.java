package Seminar06.hw;

public class HumanBuilder {
    private static HumanBuilder instance = null;
    Human obj;
    StudentBuilder stb;
    ProfessorBuilder pfb;
    private HumanBuilder(){

    }
    public static StudentBuilder getInstanceStudent(){
        return new StudentBuilder();
    }
    public static ProfessorBuilder getInstanceProfessor(){
        return new ProfessorBuilder();
    }

}
