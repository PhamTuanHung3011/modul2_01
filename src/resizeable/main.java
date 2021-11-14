package resizeable;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap he so");
        double heso1 = sc.nextInt();

        Circle hinhtron1 = new Circle( 1.5);
        System.out.println(hinhtron1.getArea());
        double area = hinhtron1.getArea();

        hinhtron1.resizeable(heso1);
        System.out.println(hinhtron1.getArea());


//        hinhtron1.resizeable(heso1);
//        System.out.println(hinhtron1.getArea());




    }
}
