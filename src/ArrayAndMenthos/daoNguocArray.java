package ArrayAndMenthos;

import java.util.Scanner;

public class daoNguocArray {

    public static void main(String[] args) {
        // nhap lieu
        System.out.println("Hello");
        Scanner input = new Scanner(System.in);


        int num1;

        do{
            System.out.println("Nhap do dai cua mang");
            num1 = input.nextInt();//nhap do dai mang;
            if (num1 > 20) {
                System.out.println("Do dai cua mang nho hon 20!");
            }
        } while(num1 > 20);
        int[] array = new int[num1];
        int i = 0;
        while (i < num1) {
            System.out.println("Nhap gia tri cac phan tu");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s", "phan tu trong mang truoc khi dao nguoc: ", "" );
        for (int j = 0; j < num1; j++) {
            System.out.print(+ array[j] + ",");
        }

        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[num1 - 1- j];
            array[num1 - 1-j] = temp;
        }
        System.out.println();
        System.out.println("Mang sau khi hoan doi: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

}
