package btvn1.cleanCode1;

public abstract class staff {
    private int id;
    private String name;
    private int age;
    private String address;
    private double salary;
    private double work_day;
    static int idnumber = 1;


    public staff() {
    }

    public staff(int id, String name, int age, String address, double salary, double work_day) {
        this.id = idnumber++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.work_day = work_day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWork_day() {
        return work_day;
    }

    public void setWork_day(double work_day) {
        this.work_day = work_day;
    }

    public static int getIdnumber() {
        return idnumber;
    }

    public static void setIdnumber(int idnumber) {
        staff.idnumber = idnumber;
    }

    public abstract double getSumSalary();

    @Override
    public String toString() {
        return "staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", work_day=" + work_day +
                '}';
    }
}
