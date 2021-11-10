package accessmodifier_static;

public class Student01 {

    private String name = "John";
    private String classes = "C02";


    public Student01() {
    }

    public Student01(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    static String setName(String name) {
         return name = name;
    }

    public String getClasses() {
        return classes;
    }

    static void setClasses(String classes) {
        classes = classes;
    }
}
