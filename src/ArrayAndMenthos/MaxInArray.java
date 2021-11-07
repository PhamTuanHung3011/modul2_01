package ArrayAndMenthos;

import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        //nhap lieu
        System.out.println("Xin chao day la chuong trinh tim kiem gia tri lon nhat trong mang 20 so");
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;
        do{
            System.out.println("Nhap so luong phan tu trong mang");
            size = input.nextInt();
                if (size > 20) {
                    System.out.println("Toi nghi ngo kha nang doc hieu cua ban");
                }
        } while(size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap gia tri cac phan tu: "+ i);
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Mang da nhap vao:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gia tri lon nhat trong mang: "+ max+ " o vi tri "+ index);

    }
}
