package ArrayAndMenthos;

import java.util.Arrays;
import java.util.Scanner;

public class combine_Array {

    public static void main(String[] args) {
        // nhap lieu

        Scanner scanner = new Scanner(System.in);


        int size1;
        int size2;
        int size3;


        int[] array1;
        int[] array2;
        int[] array3;

        do {
            System.out.println("Nhap do dai mang 1");
            size1 = scanner.nextInt();
            System.out.println("Nhap do dai mang thu 2");
            size2 = scanner.nextInt();
            if (size1 < 0 && size2 < 0) {
                System.out.println("Nhap lai di");
            }
        }
        while (size1 < 0 || size2 < 0);
        array1 = new int[size1];
        array2 = new int[size2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.floor(Math.random()*100));
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.floor(Math.random()*100));
        }

        System.out.println(Arrays.toString(array1));
        System.out.print(Arrays.toString(array2));

        size3 = array1.length + array2.length;
        array3 = new int[size3];
        int i1 = 0;
        for (int c: array1) {
            array3[i1] = c;
            i1++;
        }
        for (int c: array2) {
            array3[i1] = c;
            i1++;
        }
        System.out.println();
        System.out.println(Arrays.toString(array3) );
    }
}
