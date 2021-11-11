package hedoituonghinhhoc.circle;

public class Cylinder_Class extends CirCle_Class {
    private double height;

    public Cylinder_Class() {
    }

    public Cylinder_Class(double height) {
        this.height = height;
    }

    public Cylinder_Class(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double thetich() {
        return Math.PI * getRadius()* getHeight();
    }


    @Override
    public String toString() {
        return "Cylinder_Class{" +
                "height=" + height +
                '}';
    }

}
