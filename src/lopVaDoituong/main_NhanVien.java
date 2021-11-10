package lopVaDoituong;

import java.util.Scanner;

public class main_NhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Tu Anh", 22, "nam");
        nhanViens[1] = new NhanVien("Thang", 27, "nam");
        nhanViens[2] = new NhanVien("Huy Du", 24, "nam");

        while (true) {
            System.out.println("1. Hien thi nhan vien");
            System.out.println("2. Them nhan vien");
            System.out.println("3. Xoa nhan vien");
            int so = sc.nextInt();

            switch (so) {
                case 1:
                    show(nhanViens);
                    break;
                case 2:
                    nhanViens = add(nhanViens);

                    break;
                case 3:
                    nhanViens = delete(nhanViens);
            }

        }
    }


    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] add(NhanVien[] nhanViens) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = input.nextLine();
        System.out.println("nhap gioi tinh");
        String gender = input.nextLine();
        System.out.println("nhap tuoi");
        int age = input.nextInt();

        NhanVien nhanVien = new NhanVien(name, age, gender);

        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }
        newNV[newNV.length - 1] = nhanVien;
        return newNV;
    }

    public static NhanVien[] delete(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri muon xoa");
        int index = scanner.nextInt();

        NhanVien[] deleteNV = new NhanVien[nhanViens.length -1 ];
        for (int i = nhanViens.length -1 ; i >= 0; i--) {
            if (i > index)  deleteNV[i - 1] = nhanViens[i] ;
            else if (i == index) {
                continue;
            } else {
                deleteNV[i] = nhanViens[i];
            }
        }

        return deleteNV;
    }


}
