import java.util.Scanner;

public class interest_rate {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 1.0;

        // nhap gia tri
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien gui:");
        money = scanner.nextDouble();
        System.out.println("Nhap vao so thang gui:");
        month = scanner.nextInt();
        System.out.println("Nhap vao lai suat gui:");
        interestRate = scanner.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate /100)/12 * month;
        }
        System.out.println("So tien lai la: "+ totalInterest);
    }
}
