import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {

        // nhap du lieu
        int numberOne;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ban muon kiem tra");
        numberOne = input.nextInt();
        int count = 0;

        for (int i = 0; i <numberOne; i++){
            if (flag(i)) {
                count++;
            }
        }
        System.out.println(count+ " ");


    }
    static boolean flag(int number) {
        if (number < 2){
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
