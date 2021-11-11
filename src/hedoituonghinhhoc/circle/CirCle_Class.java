package hedoituonghinhhoc.circle;

public class CirCle_Class {

    private double radius;
    private String color;


    public CirCle_Class() {
    }
    public CirCle_Class(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CirCle_Class{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
