package Seminar06.cw;

public class WorkerBuilder {
    public static WorkerBuilder instance = null;
    Worker obj;

    public WorkerBuilder() {
    }
    public static WorkerBuilder getInstance(){
        if(instance == null)
            instance = new WorkerBuilder();
        instance.obj = new Worker();
        return instance;
    }
    public WorkerBuilder setName(String name){
        obj.setName(name);
        return this;
    }
    public WorkerBuilder setSalary(int salary){
        obj.setSalary(salary);
        return this;
    }
    public WorkerBuilder setPhoneNumber(int phoneNumber){
        obj.setPhoneNumber(phoneNumber);
        return this;
    }
    public Worker build(){
        return obj;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}
