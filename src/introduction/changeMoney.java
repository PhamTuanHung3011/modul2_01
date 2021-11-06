package introduction;

import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        final double USD = 23000;
        double vnd;
        double usd;

        System.out.println("Nhap so tien USD ban muon chuyen doi");
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextDouble();
        vnd = usd * USD;

        System.out.println("So tien cua ban la:" + vnd);
        if (vnd < 1000000) {
            System.out.println(" Ban hoi ngheo");
        }
        else if (vnd < 2000000) {
            System.out.println(" Ban hoi giau");
        }
        else {
            System.out.println(" Ban giau vai ra");
        }
    }
}
