package hedoituonghinhhoc.Point;

public class MovablePoint extends point_class {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }




    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public float getY() {
        return super.getY();
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }

    public MovablePoint move(MovablePoint movablePoint) {
        movablePoint.setX(movablePoint.getX() + xSpeed);
        movablePoint.setY(movablePoint.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint abc = new MovablePoint(10, 5);
        System.out.println(abc);
        System.out.println(abc.move(abc));
        System.out.println(abc.move(abc));

    }

}
