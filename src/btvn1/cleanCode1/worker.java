package btvn1.cleanCode1;

public class worker extends staff {
    public worker() {
    }

    public worker(int id, String name, int age, String address, double salary, double work_day) {
        super(id, name, age, address, salary, work_day);
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
