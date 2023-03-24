package Seminar06.cw;

public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().setName("Alexandra").setPhoneNumber(456465).build();
        System.out.println(worker);
        worker.setSalary(100000);
        System.out.println(worker);
    }
}
