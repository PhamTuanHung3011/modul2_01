package luyentap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {

     //phan hien thi;
            System.out.print("Chào mừng bạn đến với ");
            System.out.println("GAME AI LÀ TRIỆU PHÚ.");
            System.out.println("LỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ?");
            System.out.println("1. 1 BẠN");
            System.out.println("2. 2 BẠN");
            System.out.println("3. 3 BẠN");
            System.out.println("4. 4 BẠN");

            //nhap so tu ban phim;
            System.out.println("Nhap phuong án lựa chọn từ 1 đến 4!");
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt();

            switch (number1) {
                case 1:
                    System.out.println("Sai rồi bạn aeyyy!");
                    break;
                case 2:
                    System.out.println(" Lại sai rồi bạn aeyyy!");
                    break;
                case 3:
                    System.out.println("Đúng rồi, bố mẹ lo lắng cho bạn mà bạn lại lo đi tia gái");
                    break;
                case 4:
                    System.out.println("ở đâu ra mà lắm thế");
                default:
                    System.out.println("Thì ra bạn thích đàn ông, xin chúc mừng bạn");
            }






    }
}
