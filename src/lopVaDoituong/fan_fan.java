package lopVaDoituong;

public class fan_fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private String color = "blue";
    private boolean isStatus = false;
    private double radius = 5;
    private int speed = SLOW;

    public fan_fan() {
    }

    public boolean isStatus() {
        return isStatus;
    }
    public void setIsStatus(boolean status) {
        this.isStatus = status;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void check() {
        if (isStatus) {
           System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }

    }
    @Override
    public String toString() {
        if (isStatus) {
            return "thong tin quat {" +
                    "color='" + color + '\'' +
                    ", fan is on"  +
                    ", radius=" + radius +
                    ", speed=" + speed +
                    '}';
        }
        else {
            return "thong tin quat {" +
                    "color='" + color + '\'' +
                    ", fan is off"  +
                    ", radius=" + radius +
                    '}';
        }

    }

    public static void main(String[] args) {
        fan_fan fan1 = new fan_fan();
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setIsStatus(true);
        System.out.println(fan1.toString());

        fan_fan fan2 = new fan_fan();
        fan2.setSpeed(2);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
