package btvn1.cleanCode1;

public class Worker extends Staff {

    public Worker(String name, int age, String address, double salary, double work_day) {
        super(name, age, address, salary, work_day);
    }

    @Override
    public double getSumSalary() {
        return super.getSalary() * super.getWork_day();
    }
    public String toString() {
        return "worker{" + super.toString()+
                '}';
    }
}
