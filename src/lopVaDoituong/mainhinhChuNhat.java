package lopVaDoituong;

import java.util.Scanner;

public class mainhinhChuNhat {
    public static void main(String[] args) {
        hinhChuNhat hinhchunhat1 = new hinhChuNhat( 5,5);
        System.out.println(hinhchunhat1.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap chieu rong");
        hinhchunhat1.setWidth( scanner.nextInt());
        System.out.println(" Nhap chieu cao");
        hinhchunhat1.setHeight(scanner.nextInt());
        System.out.println(hinhchunhat1.toString());
        System.out.println(hinhchunhat1.getChuvi());
    }
}
