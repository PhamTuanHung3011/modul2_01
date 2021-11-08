package ArrayAndMenthos;

import java.util.Scanner;

public class deleteXinArray {

    public static void main(String[] args) {
        // nhap lieu
        Scanner input = new Scanner(System.in);

        int size;
        int[] Array;

        System.out.println("nhap so phan tu cua mang");
        size = input.nextInt();
        Array = new int[size];
        int i = 0;
        while (i < Array.length) {
            System.out.println("Nhap gia tri cac phan tu thu: "+i);
            Array[i] = input.nextInt();
            i++;
        }
        System.out.println("Mang da truyen vao");
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }
        System.out.println();
        System.out.println("nhap vao so ban muon xoa");
        int number1 = input.nextInt();
        int index_del = 0;
        boolean check = false;
        for (int j = 0; j < Array.length; j++) {
            if (number1 == Array[j]) {
                index_del = j + 1;
                check = true;
//                System.out.println("tim thay " + number1+ " tai vi tri " + index_del);
            }
        }
        if (check) {
            System.out.println("tim thay "+ number1+ " tai vi tri " + index_del);
            int c = i = 0;
            for (c = i = 0; i < size; i++) {
                if (Array[i] != number1) {
                    Array[c] = Array[i];
                    c++;
                }
            }
            size = c;
            System.out.println("mang moi la: ");
            for (i = 0; i < size; i++) {
                System.out.print(Array[i] + " ");
            }
        } else {
            System.out.println(" ko thay");
        }

    }
//    static int deleteX (int[] Array, int number) {
//        int[] arr;
//        int deleteX = 0;
//
//        for (int i = 0; i < Array.length; i++ ) {
//            if (Array[i] == number) {
//                deleteX = i + 1;
//                i +=1;
//            }
//        }
//        System.out.println("tim thay " + number+ " tai vi tri "+ deleteX);
//        System.out.println("Mang da xoa" + Array[i]);
//        return Array[i];
//    }
}
