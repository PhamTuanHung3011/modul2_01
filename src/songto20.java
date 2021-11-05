import java.util.Scanner;

public class songto20 {

    public static void main(String[] args) {
        // nhap gia tri
        int numberOne;
        System.out.println("Nhap gia tri can kiem tra");
        Scanner input = new Scanner(System.in);
        numberOne = input.nextInt();// gan gia tri tu ban phim
        int count = 1, i = 2;
        do {
            if (checkOne(i)) {
                System.out.print(i +" ");
                count++;
            }
            i++;
        }
        while (count <= numberOne);
    }
    static boolean checkOne(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}

