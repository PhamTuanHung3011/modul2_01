package ArrayAndMenthos;

import java.util.Arrays;
import java.util.Scanner;

public class twodimensionalarrays {

    public static void main(String[] args) {
        // nhap lieu

        int row1;
        int column1;
        int[][] array;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Nhap n cot");
            row1 = scanner.nextInt();
            System.out.println("Nhap m hang");
            column1 = scanner.nextInt();
            if (row1 < 0 && column1 < 0) {
                System.out.println("nhap lai di ban oi");
            }
        }
        while (row1 < 0 && column1 < 0);

        array = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                array[i][j] = (int) (Math.floor(Math.random()*100));
            }
        }
        for (int[] c: array) {
            System.out.println(Arrays.toString(c));
        }

//        int max = array[0][0];
//        for (int i = 0; i < row1; i++) {
//            for (int j = 0; j < column1; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println("gia tri lon nhat trong mang 2 chieu la: " + max);

        int a = MaxInArray(array);
        System.out.println("max trong mang la: "+ a);
    }

    static int MaxInArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
