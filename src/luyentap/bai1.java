package luyentap;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        int count = 0;
        int number;

        //nhap du lieu
        System.out.println("Vi tri ban muon tim");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int i = 11;
        do {
            if (check(i)) {
                System.out.println(i);
                count++;
            }
            i++;

        } while (count < number);

//        for (int i = 11; count < number; i++ ) {
//            if (check(i)) {
//                count++;
//                System.out.println(i);
//            }
//            i++;
//        }

//        int i = 11;
//        while (count < number){
//
//            if (check(i)) {
//                System.out.println(i);
//                count++;
//
//            }
//            i++;
//
//        }

    }

    static boolean check (int i) {
        if ( i % 5 !=0 ) {
            return false;
        }
        else {
            return true;
        }
    }
}
