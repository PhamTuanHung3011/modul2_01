package luyentap;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        int number;
        int sum = 0;

        // nhap gia tri
        System.out.println("Hello, day la chuong trinh tinh tong so nguyen tu min toi max");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri min");
        int num1 = input.nextInt();
        System.out.println("Nhap gia tri max");
        int num2 = input.nextInt();
        if (num1 < num2) {
            for (int i = num1 ; i < num2 ; i++) {
                if (checkOne(i)) {
                    sum += i;
                    System.out.println(i+"");
//                System.out.println("Tong so nguyen to tu 10 den 50 la: "+ sum);
                }
            }
            System.out.println("Tong so nguyen to tu "+ num1+ " den "+ num2+ "la: "+ sum);
        } else {
            for (int i = num2 ; i < num1 ; i++) {
                if (checkOne(i)) {
                    sum += i;
                    System.out.println(i+"");
//                System.out.println("Tong so nguyen to tu 10 den 50 la: "+ sum);
                }
            }
            System.out.println("Tong so nguyen to tu "+ num1+ " den "+ num2+ " la: "+ sum);
        }

        }


    static boolean checkOne (int num1) {
       if (num1 < 2) {
           return false;
       }
       else {
           for (int a = 2; a <= Math.sqrt(num1); a++) {
               if (num1 % a == 0) {
                   return false;
               }
           }
           return true;
       }

    }
}
