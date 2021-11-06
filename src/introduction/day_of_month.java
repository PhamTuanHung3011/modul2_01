package introduction;

import java.util.Scanner;

public class day_of_month {

    public static void main(String[] args) {
        int month;
        System.out.println("Hay nhap so thang cua ban");

        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();
        if (month <= 12 && month > 0) {
            switch (month){
                case 2:
                    System.out.println("Thang 2 co 28 hoac 29 ngay");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang "+ month+ " co 31 ngay");
                    break;
                default:
                    System.out.println("Thang "+ month+ "co 30 ngay");
            }
        } else {
            System.out.println("Hay nhap lai thang ma ban can tim!!!");
        }

    }
}
