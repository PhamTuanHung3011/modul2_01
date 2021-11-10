package accessmodifier_static;

public class TestStatic {
    public static void main(String[] args) {
        Student.chage();

        Student s1 = new Student(1, "Huy Du");
        Student s2 = new Student(2, "Tu Anh");
        Student s3 = new Student(3, "Tai");


        s1.display();
        s2.display();
        s3.display();
    }
}
