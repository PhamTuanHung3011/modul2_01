package hedoituonghinhhoc.Point;

public class point_class {
    private float x = 0.0f;
    private float y = 0.0f;

    public point_class() {
    }

    public point_class(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "point_class{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
