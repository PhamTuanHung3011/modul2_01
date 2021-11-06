package introduction;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;
        boolean namNhuan = false;
        System.out.println(" Hay nhap nam ban muon kiem tra");

        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }
        if (namNhuan) {
            System.out.println("Nam "+ year+ " la nam nhuan");
        } else {
            System.out.println("Nam "+ year+ " khong phai la nam nhuan");
        }
    }
}
