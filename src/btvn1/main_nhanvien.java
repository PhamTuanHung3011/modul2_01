package btvn1;

import java.util.Scanner;

public class main_nhanvien {
    public static void main(String[] args) {

        nhanvien[] nhanviens = new nhanvien[3];
        nhanviens[0] = new congnhan("abc",20, "ha noi", 20000, 24);
        nhanviens[1] = new congnhan("abc",20, "ha noi", 20000, 22);
        nhanviens[2] = new congnhan("abc",22, "ha noi", 20000, 22);


        for (int i = 0; i < nhanviens.length; i++) {
            System.out.println(nhanviens[i].toString());
        }

        while (true) {

            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tìm kiếm nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Sủa thông tin nhân viên");
            System.out.println("5. Hiển thị danh sách nhân viên");
            System.out.println("6. Sắp xếp nhân viên");
            System.out.println("7. Exit");

            Scanner sc = new Scanner(System.in);
            int so = sc.nextInt();

            switch (so) {
                case 1:
                    System.out.println("bạn muốn thêm công nhân: 1");
                    System.out.println("bạn muốn thêm kỹ sư: 2");
                    int so1 = sc.nextInt();
                    switch (so1) {
                        case 1:
                            nhanviens = control.themCongNhan(nhanviens);
                            break;
                        case 2:
                            nhanviens = control.themkysu(nhanviens);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3: nhanviens = control.delete(nhanviens);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Hiển thị danh sách công nhân: 1");
                    System.out.println("Hiển thị danh sách kỹ su: 2");
                    int so5 = sc.nextInt();
                    switch (so5) {
                        case 1:
                            control.showCN(nhanviens);
                            break;
                        case 2:
                            control.showKS(nhanviens);
                            break;
                    }
                    break;


            }


        }
    }

}
