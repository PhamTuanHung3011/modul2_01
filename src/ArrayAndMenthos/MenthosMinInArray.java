package ArrayAndMenthos;

import java.util.Scanner;

public class MenthosMinInArray {
    public static void main(String[] args) {

        // nhap lieu
        System.out.println("Hello");
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;
        System.out.println("Nhap so luong phan tu trong mang");
        size = input.nextInt();//do dai cua mang;
        array = new int[size];


        for (int i = 0; i < array.length; i++) {
            if (i < size) {
                System.out.println("Nhap gia tri phan tu");
                array[i] = input.nextInt();
            }
        }

        System.out.println( MinInArray(array));
    }

    public static int MinInArray (int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }

        }
        System.out.println("Gia tri nho nhat trong mang la: "+ min + " o vi tri "+ index);

    return index;
    }

}
