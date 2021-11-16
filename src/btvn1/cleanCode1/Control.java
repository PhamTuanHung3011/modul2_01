package btvn1.cleanCode1;

import java.util.Arrays;
import java.util.Scanner;

public class Control {
    static staff[] staffs = new staff[0];
    static Scanner scanner = new Scanner(System.in);
    // ham tao doi tuong nhan vien
    public static staff createStaff (boolean isEngineer) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double work_day = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isEngineer) {
            worker newWorker = new worker(id, name, age, address, salary, work_day);
            return newWorker;
        } else {
            System.out.println("Enter payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            engineer newEngineer = new engineer(id, name, age, address, salary, work_day, payRateSalary);
            return newEngineer;
        }
    }
    // ham hien thi show()
    public static void show() {
        for (staff staff : staffs) {
            System.out.println(staff);
        }
    }
    // ham them nhan vien
    public static void addStaff(staff staffADD) {
        staff[] newStaff = new staff[staffs.length + 1];
        for (int i = 0; i < staffs.length; i++) {
            newStaff[i] = staffs[i];
        }
        newStaff[newStaff.length -1] = staffADD;
        staffs = newStaff;
    }

    public static void search() {
        System.out.println("Hay nhap ten ban muon tim kiem");
        String name = scanner.nextLine();
        boolean check = false;
        int count = 0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i].getName().contains(name)) {
                System.out.println(staffs[i] + "\n");
                check = true;
                count++;
            }else {
                check = false;
            }
        }
        if(!check && count == 0) {
            System.out.println("Khong tim thay ten");
        }

    }

    public static int searchID(staff[] staffID) {
        int ID = Integer.parseInt(scanner.nextLine());
        while (ID < 0) {
            System.out.println("Hay nhap lai");
        }
        for (int i = 0; i < staffID.length; i++) {
            if (ID == staffID[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public static staff[] deleteStaff(staff[] deleteStaff) {//truyen mang can xoa;
        search();
        System.out.println("Nhap Id theo ten can xoa");
        int index = searchID(deleteStaff);
        staff[] newDeleteStaff = new staff[deleteStaff.length + 1];
            for (int i = 0, j = 0; i < deleteStaff.length; i++) {
                if (i == index) {
                    continue;
                }
                newDeleteStaff[j++] = deleteStaff[j];
            }
        return deleteStaff;
    }

    public static void showStaff() {
        for (staff newStaff: staffs) {
            System.out.println(newStaff.toString());
        }
    }


}
