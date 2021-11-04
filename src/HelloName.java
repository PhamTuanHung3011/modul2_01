import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        String SayHello;
        String Gender;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban");
        SayHello = scanner.nextLine();// nhap ten
        System.out.println("Nhap gioi tinh cua ban");
        Gender = scanner.nextLine();// nhap gioi tinh

        if (Gender.equals("Nam") ) {
            System.out.println("xin chao ngai: "+ SayHello);
        } else if (Gender.equals("Nu") ) {
            System.out.println("xin chao quy co "+ SayHello);
        } else {
            System.out.println("Xin chao the gioi GLBT");
        }

    }

}
