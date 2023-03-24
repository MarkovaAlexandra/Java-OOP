package Seminar06.hw;

public class Main {
    public static void main(String[] args) {
       Student st = StudentBuilder.getInstance().setName("Alexandra").setBirthYear(1984).build();
       Professor pf = ProfessorBuilder.getInstance().setName("mr Black").setGender("male").build();
       Student st1 = HumanBuilder.getInstanceStudent().getInstance().setName("Matilda").setAverageGrade(4).build();
       Professor pf1 = HumanBuilder.getInstanceProfessor().getInstance().setName("mr White").setSalary(100000).build();
        System.out.println(st);
        System.out.println(st1);
        System.out.println(pf);
        System.out.println(pf1);
        st1.setFacultet("java");
        System.out.println(st1);




    }
}
