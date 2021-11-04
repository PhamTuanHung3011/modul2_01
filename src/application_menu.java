import java.util.Scanner;

public class application_menu {
    public static void main(String[] args) {
        int choice = -1;
        //hien thi lua chon;
        Scanner input = new Scanner(System.in);


        System.out.println("Menu");
        System.out.println("1.Hinh tam giac");
        System.out.println("2.Hinh vuong");
        System.out.println("3.Hinh chu nhat");
        System.out.println("4. Hinh nguoi yeu");
        System.out.println("0.Exit");
        System.out.println("Chon hinh muon ve!");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ve tam giac");
                System.out.println("********");
                System.out.println("******");
                System.out.println("****");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Ve hinh vuong");
                System.out.println(" * * * * ");
                System.out.println(" * * * * ");
                System.out.println(" * * * * ");
                System.out.println(" * * * * ");
                break;
            case 3:
                System.out.println("Ve hinh chu nhat");
                System.out.println(" * * * *");
                System.out.println(" * * * *");
            case 4:
                System.out.println("Ve hinh nguoi yeu");
                System.out.println("leu leu ban da bi lua");
                System.out.println(" ^   ^ ");
                System.out.println("   o  ");
            case 0: System.exit(0);
            default:
                System.out.println("Tai sao ko lua chon");
        }

    }
}
