package btvn1.cleanCode1;

public class engineer extends staff {
    private double payRateSalary;

    public engineer() {
    }

    public engineer(int id, String name, int age, String address, double salary, double work_day, double payRateSalary) {
        super(id, name, age, address, salary, work_day);
        this.payRateSalary = payRateSalary;
    }

    public double getPayRateSalary() {
        return payRateSalary;
    }

    public void setPayRateSalary(double payRateSalary) {
        this.payRateSalary = payRateSalary;
    }

    @Override
    public String toString() {
        return "engineer{" +
                "payRateSalary="+ super.toString()+ payRateSalary +
                '}';
    }

    @Override
    public double getSumSalary() {
        return super.getSalary() * super.getWork_day() * payRateSalary;
    }
}
