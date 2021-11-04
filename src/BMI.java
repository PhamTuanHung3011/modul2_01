import java.util.Locale;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        int age;
        double weight;
        double height;
        double BMI;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        scanner.locale();
        System.out.println(""+ scanner.locale());


        System.out.println("Nhap so tuoi cua ban");
        age = scanner.nextInt();// nhap tuoi
        if (age < 20) {
            System.out.println("Ban chua du tuoi nhe!");
        }


        else {
            System.out.println("Nhap can nang: ");
            weight = scanner.nextDouble();// nhap can nang

            System.out.println("Nhap chieu cao: ");
            height = scanner.nextDouble(); // nhap chieu cao he so cm22;

            BMI = weight / Math.pow(height,2) ;
            if (BMI < 18.5) {
                System.out.println("Nghien!");
            } else if ( BMI <=25.0) {
                System.out.println("Normal");
            } else if ( BMI <= 30.0) {
                System.out.printf("%-20.2f%s", BMI, "Overweight");
            } else {
                System.out.println("Obese");
            }
        }
    }
}


