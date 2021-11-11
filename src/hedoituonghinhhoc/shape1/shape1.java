package hedoituonghinhhoc.shape1;

public class shape1 {
    private String color;
    private boolean filled = false;

    public shape1() {
    }

    public shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape1{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}
