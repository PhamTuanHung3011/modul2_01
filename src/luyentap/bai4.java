package luyentap;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        // nhap lieu tu ban phim
        System.out.println(" Hay nhap so tu 1-10 ");
        Scanner input = new Scanner(System.in);

       double x = Math.floor(Math.random()*10);
        int count = 0;

       while (count < 3) {
           System.out.println("Hay nhap so cua ban");
           int number = input.nextInt();
           if (number == x) {
               System.out.println("Ban da trung thuong");
               break;
           } else if (number > x) {
               count++;
               if (count < 3) {
                   System.out.println("Doan thap xuong ban oi");
               } else {
                   System.out.println("Game over roi ban oi");
               }

           } else {
               count++;
               if (count < 3) {
                   System.out.println("Doan cao len ban oi");
               } else {
                   System.out.println("Game over roi ban oi");
               }

           }
       }
       if (count > 2) {
           System.out.println("Ban da doan "+ count+ " luot nhung van sai, ban ga vai ^^!");
       }
    }


}
