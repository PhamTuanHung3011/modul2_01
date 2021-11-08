package ArrayAndMenthos;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuongCheo {

    public static void main(String[] args) {
        int row; //
        int column;
        int[][] array;
        try (Scanner scanner = new Scanner(System.in)) {

            do {
                System.out.println("Nhap n cot");
                row = scanner.nextInt();
                System.out.println("Nhap m dong");
                column = scanner.nextInt();
                if (row < 0 && column < 0) {
                    System.out.println(" nhap lai di ban oii");
                }
            }
            while (row <= 0 && column <= 0);
        }
        array = new int [row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                array[i][j] = (int) (Math.floor(Math.random()*100));
            }
        }
        for (int[] c:array) {
            System.out.println(Arrays.toString(c));
        }

        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                if (i == j) {
                  sum += array[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
