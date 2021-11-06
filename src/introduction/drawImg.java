package introduction;

import java.util.Scanner;

public class drawImg {
    public static void main(String[] args) {

        // hien thi ra man hinh;
        System.out.println("Lua chon hinh muon ve");
        System.out.println("1. Hinh vuong");
        System.out.println("2. Hinh tam giac vuong to bottom");
        System.out.println("3. Hinh tam giac vuong o top");
        System.out.println("4. Hinh tam giac can");
        System.out.println("5. Hinh nguoi yeu cua ban");
        System.out.println("0. Exit");

        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();// nhap gia tri


        switch (number) {
            case 1: for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" * ");
            }
            break;
            case 2: for (int i = 1; i < 5; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");;
                }
                System.out.println("*");
            }
            break;
            case 3: for (int i = 6; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" * ");
            }
            break;
            case 4:
                System.out.println("Nhap chieu cao cua tam giac");
                int numberOne, k = 0;
                numberOne = input.nextInt();
                for (int i = 1; i < numberOne; ++i, k=0 ) {
                        for (int j = 1; j < numberOne -1 ; ++j) {
                            System.out.print(" ");
                        }
                        while (k !=2 *1 -1) {
                            System.out.print("* ");
                            k++;
                        }
                    System.out.println();
            }
                break;
            case 5:
                System.out.println("Ban ngay tho qua di a");
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Hay lua chon hinh nguoi yeu cua ban");

        }
    }

}

