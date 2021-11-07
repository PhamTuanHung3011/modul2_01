package ArrayAndMenthos;

import java.util.Scanner;

public class converterCtoF {

    public static void main(String[] args) {
    // nhap lieu
        System.out.println("Chuong trinh tinh do C sang F va nguoc lai");

        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban lua chon!");
        System.out.println("1. Doi tu do C sang do F");
        System.out.println("2. Doi tu do F sang do C");
        // nhap du lieu tu ban phim

        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Moi ban nhap do C:");
                double numberC = input.nextDouble();
                System.out.println(numberC+ " doi sang do F la: " + CtoF(numberC)+ " do F" );
                break;
            case 2:
                System.out.println(" Moi ban nhap do F");
                double numberF = input.nextDouble();
                System.out.println(numberF+ " doi sang do C la: "+ FtoC(numberF) + " do C");
                break;
            default:
                System.out.println("Ban rat tinh va dep trai, so dt cua trai tam than chau quy la: 024 38276534 ");
        }

    }

    public static double CtoF (double numberC) {
        double result = (9.0 / 5) * numberC + 32;
        return result;
    }

    public static double FtoC (double numberF) {
        double result = (5.0 / 9) * (numberF - 32);
        return result;

    }
}
