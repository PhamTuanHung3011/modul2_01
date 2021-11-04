import java.util.Scanner;

public class divisor {

    public static void main(String[] args) {
        int number1;
        int number2;


        //nhap thong tin;
        System.out.println("Nhap so thu nhat!");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();//nhap so thu nhat
        System.out.println("Nhap so thu hai!");
        number2 = input.nextInt();


        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        if (number1 == 0 || number2 == 0) {
            System.out.println("So "+ number1+ " va "+ number2+ " khong co uoc chung lon nhat");

        }
        while ( number1 != number2) {
            if (number1 > number2) {
                 number1 -=  number2;
            } else {
               number2 -= number1;
            }
        }
        System.out.println("Uoc chung lon nhat cua 2 so la "+ number1);

    }
}
