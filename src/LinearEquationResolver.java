import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in); // khai bao doi tuong trong scanner

        System.out.println("Nhap so thu nhat: ");
        a = scanner.nextDouble();

        System.out.println("Nhap so thu hai:");
        b = scanner.nextDouble();


        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiemj!");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double Epuation = -b/a;
            System.out.println("Phuong trinh co nghiem la: "+Epuation);
        }

    }
}
