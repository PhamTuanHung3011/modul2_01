package accessmodifier_static;

public class car_testStatic {

    public static void main(String[] args) {

        car car1 = new car("Honda","Skyactiv 3");
        System.out.println(car.numberOfCar);
        car car2 = new car("Mazda 6", "Skyactiv 3");
        System.out.println(car.numberOfCar);
    }
}
