package luyentap;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        // khai bao bien;
        int number;
        // nhap gia tri tu ban phim
        System.out.println("Hay nhap so ban muon kiem tra");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (checkin(number)) {
            System.out.println(number+ " la so nguyen to");
        } else {
            System.out.println(number+ " khong phai so nguyen to");
        }
    }

    static boolean checkin (int numB) {
        if (numB < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(numB); i++) {
                if (numB % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
