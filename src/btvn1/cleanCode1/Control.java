package btvn1.cleanCode1;

import java.util.Scanner;

public class Control {
    static Staff[] staffs = new Staff[0];
    static Scanner scanner = new Scanner(System.in);

    // ham tao doi tuong nhan vien
    public static Staff createStaff(boolean isEngineer) {
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
            Worker newWorker = new Worker(name, age,address,salary,work_day);
            return newWorker;
        } else {
            System.out.println("Enter payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            Engineer newEngineer = new Engineer(name, age,address,salary,work_day,payRateSalary);
            return newEngineer;
        }
    }

    // ham hien thi show()
    public static void show() {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }

    // ham them nhan vien
    public static void addStaff(Staff staffADD) {
        Staff[] newStaff = new Staff[staffs.length + 1];
        for (int i = 0; i < staffs.length; i++) {
            newStaff[i] = staffs[i];
        }
        newStaff[newStaff.length - 1] = staffADD;
        staffs = newStaff;
    }
    // tim kiem theo ten nhan vien
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
            } else {
                check = false;
            }
        }
        if (!check && count == 0) {
            System.out.println("Khong tim thay ten");
        }

    }
    // tim kiem ID
    public static int searchID(Staff[] staffID) {
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
    // xoa nhan vien theo ten va ID
    public static Staff[] deleteStaff(Staff[] deleteStaff) {//truyen mang can xoa;
        search();
        System.out.println("Nhap Id theo ten can xoa");
        int index = searchID(deleteStaff);
        Staff[] newDeleteStaff = new Staff[deleteStaff.length - 1];
        for (int i = 0, j = 0; i < deleteStaff.length; i++) {
            if (i == index) {
                continue;
            }
            newDeleteStaff[j++] = deleteStaff[j];
        }

        return newDeleteStaff;
    }

    public static void showStaff() {
        for (Staff newStaff : staffs) {
            if(newStaff != null){
                System.out.println(newStaff.toString());
            }
        }
    }
    // sua thong tin nhan vien
    public static Staff[] upDateStaff(Staff[] updateStaff) {
        search();
        System.out.println("Nhap ID theo ten can sua");
        int index = searchID(updateStaff);
        for (int i = 0; i < updateStaff.length; i++) {
            if (i == index) {
                updateSupport(updateStaff[i]);
            }
        }

        return updateStaff;
    }
    public static Staff updateSupport(Staff staff) {
        int so = 1;
        while (so!=0){
            System.out.println("1. Sua ten");
            System.out.println("2. Sua tuoi");
            System.out.println("3. Sua dia chi");
            System.out.println("4. Sua ngay cong");
            System.out.println("5. muc luong");
            System.out.println("0. Exit");
            so = scanner.nextInt();
            int choise = scanner.nextInt();
            switch (choise) {

                case 1:
                    System.out.println("Nhap ten nhan vien muon sua");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    staff.setName(name);
                    break;
                case 2:
                    System.out.println("Nhap tuoi muon sua");
                    int age = scanner.nextInt();
                    staff.setAge(age);
                    break;
                case 3:
                    System.out.println("Nhap dia chi muon sua");
                    staff.setAddress(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Nhap ngay cong muon sua");
                    staff.setWork_day(Double.parseDouble(scanner.nextLine()));
                    break;
                case 5:
                    System.out.println("Nhap muc luong muon sua");
                    staff.setSalary(Double.parseDouble(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Moi ban nhap lai");
            }
        }
        return staff;
    }
}
