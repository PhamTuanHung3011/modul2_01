package introduction;

import java.util.Scanner;

public class converterNumbetToString {

    public static void main(String[] args) {
        int numBer;
        double toConverter;
        String toString;

        System.out.println("Hay nhap so duoi 999");
        Scanner scanner = new Scanner(System.in);
        numBer = scanner.nextInt();

        if (numBer <= 10) {
            switch (numBer){
                case 0:
                    System.out.println("So 0");
                    break;
                case 1:
                    System.out.println("So 1");
                    break;
                case 2:
                    System.out.println("So 2");
                    break;
                case 3:
                    System.out.println("So 3");
                    break;
                case 4:
                    System.out.println("So 4");
                    break;
                case 5:
                    System.out.println("So 5");
                    break;
                case 6:
                    System.out.println("So 6");
                    break;
                case 7:
                    System.out.println("So 7");
                    break;
                case 8:
                    System.out.println("So 8");
                    break;
                case 9:
                    System.out.println("So 9");
                    break;
                case 10:
                    System.out.println("So 10");
                    break;
            }
        }
        if (numBer < 20) {
            toConverter = numBer % 10;
        }

    }
}
