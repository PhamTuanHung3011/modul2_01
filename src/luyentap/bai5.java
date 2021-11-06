package luyentap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        // nhap gia tri tu ban phim

        System.out.println("hello, day la chuong trinh giai phuong trinh bac 2");
        Scanner input = new Scanner(System.in);
        System.out.println("nhap he so A");
        double numberA = input.nextDouble();
        System.out.println("nhap he so B");
        double numberB = input.nextDouble();
        System.out.println("nhap he so C");
        double numberC = input.nextDouble();
        double x1,x2, delta;


        if (numberA == 0 && numberB == 0 && numberC == 0) {
            System.out.println("Bạn là người rất hài hước, tôi đấm cho bạn mấy phát giờ đấy");
        }
        else if (numberA == 0 && numberB == 0) {
            System.out.println("Cả A và B đều bằng 0 thì tính cái gì, tôi đấm bạn đấy!!! đừng đùa");
        } else if ( numberA == 0) {
            x1 = x2 = -(numberC)/numberB;
            System.out.println("Phuong trinh co 1 nghiem x= "+x1);
        } else {
            delta = Math.pow(numberB,2) - 4*numberA*numberC;
            if (delta < 0) {
                System.out.println("Rất tiếc phương trình vô nghiệm");
            }
            else if (delta == 0) {
                x1 = x2 = -(numberB)/(2*numberA);
                System.out.println("Phuong trinh co nghiem kep: "+ x1);
            }
            else {
                x1 = (-numberB + Math.sqrt(delta))/(2* numberA);
                x2 = (-numberB - Math.sqrt(delta))/(2* numberA);
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.println("x1 co nghiem la: "+ x1);
                System.out.println("x2 co nghiem la: "+ x2);
            }
        }



    }


}
