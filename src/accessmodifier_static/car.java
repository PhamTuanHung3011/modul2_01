package accessmodifier_static;

public class car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;


    }
}
