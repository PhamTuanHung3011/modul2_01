package ArrayAndMenthos;

import java.util.Scanner;

public class searchValue {

    public static void main(String[] args) {

        String[] students = {"Huy Du","Tu", "Tu Anh", "Tung", "Sy", "Thang", "Thang Xoan"};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten muon tim kiem");
        String search = input.nextLine();


            boolean check = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(search)) {
                    System.out.println("Da tim thay ten: "+ search+ " trong danh sach");
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println("khong tim thay "+ search+ " trong danh sach");
                System.out.println("Hay tim kiem lai");
            }

    }

}
