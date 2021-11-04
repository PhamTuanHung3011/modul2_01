import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int numBer;
        boolean check = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hay nhap so can kiem tra:");
        numBer = scanner.nextInt();// nhap so de kiem tra;

        if (numBer < 2) {
            System.out.println("Khong phai so nguyen to");
        }
        else {
            int i = 2;
            check = true;;
            while ( i < numBer){
                if (numBer % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(numBer+ " la so nguyen to");
            }
            else {
                System.out.println(numBer + " khong phai la so nguyen to");
            }
        }

    }
}
