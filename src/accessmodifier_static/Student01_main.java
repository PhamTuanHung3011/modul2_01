package accessmodifier_static;

public class Student01_main {
    public static void main(String[] args) {
        Student01 sv1 = new Student01();



        System.out.println(sv1.getName());
        Student01.setName("Hello");
        System.out.println(sv1.getName());
    }
}
