package ArrayAndMenthos;

import java.util.Arrays;
import java.util.Scanner;

public class sumInMatrixArray {
    public static void main(String[] args) {
    // nhap lieu;

        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        int[][] array;

        do {
            System.out.println("Nhap n dong");
            row = scanner.nextInt();
            System.out.println("Nhap m cot");
            column = scanner.nextInt();
            if ( row <0 && column < 0) {
                System.out.println(" nhap lai di ban oi");
            }
        }
        while (row <= 0 && column <= 0);
        int sum = 0;
        array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                array[i][j] = (int) (Math.floor(Math.random()*100));
            }
        }
        for (int[] c:array) {
            System.out.println(Arrays.toString(c));
        }
        int number;
        do {
            System.out.println("vi tri cot can tinh tong");
            number = scanner.nextInt();
            if (number > row) {
                System.out.println("nhập lại đi bố code đang nóng, đừng  có đùa");
            }
        }
        while (number > row);

            for (int i = 0; i < row; i++) {
                sum += array[i][number];
            }


        System.out.println("tong cot la" + sum);
    }
}
