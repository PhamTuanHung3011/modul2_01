package btvn1.cleanCode1;

import java.util.Scanner;

public class Staff_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa nhân viên");
            System.out.println("5.Hiển thị nhân viên");
            System.out.println("6.Sắp xếp nhân viên");
            System.out.println("7.Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            Staff Work = Control.createStaff(false);
                            Control.addStaff(Work);
                            break;
                        case 2:
                            Staff Engineers = Control.createStaff(true);
                            Control.addStaff(Engineers);
                            break;
                        default:
                            break;
                    }
                    break;

                case 2: Control.search();
                    break;
                case 3:Control.staffs =Control.deleteStaff(Control.staffs);
                Control.showStaff();
                break;
                case 4:Control.staffs = Control.upDateStaff(Control.staffs);
                Control.show();
                case 5: Control.showStaff();

            }
        }
    }
}
