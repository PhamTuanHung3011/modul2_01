package accessmodifier_static;

public class Student {
    private int roll;
    private String name;
    private static String college = "";

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    static void chage() {
        college = "codegym";
    }

    void display() {
        System.out.println("" + roll+ " "+ name+ " "+ college);
    }
}
