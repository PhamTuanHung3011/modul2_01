package ArrayAndMenthos;

import java.util.Arrays;
import java.util.Scanner;

public class svdo {

    public static void main(String[] args) {
        // nhap lieu

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("nhap do dai phan tu");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Nhap lai duoi 30");
            }
        } while (size > 30);
        array = new int[size];
        for (int j = 0; j < array.length; j++) {
            System.out.println("nhap diem cua cac ban: " + j);
            array[j] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(array));

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >=5 && array[i] <=10 ) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Co "+count+" ban co diem lon hon 5" );
    }
}
