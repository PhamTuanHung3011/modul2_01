package accessmodifier_static;

public class access_modifier {
    private static double radius = 1.0;
    private String color = "red";

    public access_modifier() {
    }

    public access_modifier(double radius) {
        radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        radius = radius;
    }

    public static double getArea() {
        return (Math.pow(radius,2))*Math.PI;
    }
}
