package lopVaDoituong;

public class QuadraticEquation {
    private double number1;
    private double number2;
    private double number3;
    double delta;

//    public QuadraticEquation() {
//    }

    public QuadraticEquation(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;

    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getDiscriminant () {
        return delta = (number2*number2) - 4*number1*number3 ;
    }

    public double nghiemX1 () {
        return (-number2 + Math.sqrt(delta)) / 2*number1;
    }
    public  double nghiemX2() {
        return (-number2 - Math.sqrt(delta)) / 2*number1;
    }
    public double nghiemkep() {
        return -number2 / (2* number1);
    }

}
