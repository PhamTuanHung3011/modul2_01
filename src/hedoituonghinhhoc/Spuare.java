package hedoituonghinhhoc;

public class Spuare extends Rectangle {

    public Spuare() {
        super();
    }

    public Spuare(double side) {
        super(side, side);
    }

    public Spuare (double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide( double side) {
        setWidth(side);
        setLength(side);
    }

//    @Override
//    public void setWidth( double width) {
//        setSide(width);
//    }
//    @Override
//    public void setLength (double length) {
//        setSide(length);
//    }
    @Override
    public String toString() {
        return "A Spuare with size=" + getSide() + ", which is a subclass of "+ super.toString();
    }


    public static void main(String[] args) {
        Spuare spuare1 = new Spuare();
        System.out.println(spuare1);
        spuare1.setWidth(5.0);
        System.out.println(spuare1.getSide());
    }
}
