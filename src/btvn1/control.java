package btvn1;

import java.util.Scanner;

public class control {
    static Scanner sc = new Scanner(System.in);

    public static nhanvien createCn() {
        System.out.println("Nhap ten cong nhan");
        sc.nextLine();
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi cua cong nhan");
        int tuoi = sc.nextInt();
        System.out.println("Nhap dia chi cua cong nhan");
        sc.nextLine();
        String diachi = sc.nextLine();
        System.out.println("Nhap luong cua cong nhan");
        double luong = sc.nextDouble();
        System.out.println("So ngay cong");
        double ngaycong = sc.nextDouble();

        nhanvien dtnhanvien = new nhanvien(ten, tuoi, diachi, luong, ngaycong);
        return dtnhanvien;
    }

    public static nhanvien createKS() {

        System.out.println("Nhap ten ky su");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi cua ky su");
        int tuoi = sc.nextInt();
        System.out.println("Nhap dia chi cua ky su");
        sc.nextLine();
        String diachi = sc.nextLine();
        System.out.println("Nhap luong cua ky su");
        double luong = sc.nextDouble();
        System.out.println("So ngay cong");
        double ngaycong = sc.nextDouble();
        System.out.println("He so luong");
        double heSoLuong = sc.nextDouble();
        kysu dtnhanvien = new kysu(ten, tuoi, diachi, luong, ngaycong);
        ((kysu) dtnhanvien).setHeso(heSoLuong);
        return dtnhanvien;
    }

    public static nhanvien[] themCongNhan(nhanvien[] nhanviens) {
        nhanvien nhanvien1 = createCn();
        nhanvien[] nv1 = new nhanvien[nhanviens.length + 1];
        for (int i = 0; i < nhanviens.length; i++) {
            nv1[i] = nhanviens[i];
        }
        nv1[nv1.length - 1] = nhanvien1;
        return nv1;
    }

    public static nhanvien[] themkysu(nhanvien[] nhanviens) {
        nhanvien nhanvien1 = createKS();
        nhanvien[] nv1 = new nhanvien[nhanviens.length + 1];
        for (int i = 0; i < nhanviens.length; i++) {
            nv1[i] = nhanviens[i];
        }
        nv1[nv1.length - 1] = nhanvien1;
        return nv1;
    }

    public static void search(nhanvien[] nhanviens) {
        System.out.println("Nhap ten muon tim kiem");
        String ten = sc.nextLine();
        boolean check = false;
        int count = 0;

        for (int i = 0; i < nhanviens.length; i++) {
            if (nhanviens[i].getTen().contains(ten)) {
                System.out.println(nhanviens.toString());
                count++;
                check = true;
            } else {
                check = false;
            }
        }
        if (!check && count == 0) {
            System.out.println("Ten ban nhap vao khong co trong danh sach");
        }
    }

    public static int timkiemID(nhanvien[] nhanviens) {
        System.out.println("nhap ID");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nhanviens.length; i++) {
            if (id == nhanviens[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public static nhanvien[] delete(nhanvien[] nhanviens) {

        search(nhanviens);
        System.out.println("Nhap ID theo ten can xoa");
        int index = timkiemID(nhanviens);
        if (index >= 0) {
            nhanvien[] nhanviens1 = new nhanvien[nhanviens.length - 1];
            for (int i = nhanviens.length - 1; i > 0; i--) {
                if (i < index) {
                    nhanviens1[i] = nhanviens[i - 1];
                } else {
                    nhanviens1[i] = nhanviens[i];
                }
            }
            return nhanviens1;

        }
        return nhanviens;
    }

    public static void showCN(nhanvien[] nhanviens) {
        for (int i = 0; i < nhanviens.length - 1; i++) {
            if (!(nhanviens[i] instanceof kysu)){
                System.out.println(nhanviens[i].toString());
            }

        }
    }

    public static void showKS(nhanvien[] nhanviens) {
        for (int i = 0; i < nhanviens.length - 1; i++) {
            if ( nhanviens[i] instanceof kysu) {
                System.out.println(nhanviens[i]);
            }
        }
    }

}