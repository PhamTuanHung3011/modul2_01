package ArrayAndMenthos;

import java.util.Scanner;

public class countToString {

    public static void main(String[] args) {
        // nhap lieu

        Scanner scanner = new Scanner(System.in);

        // nhap chuoi ki tu tu ban phim


        int count = 0;
        System.out.println("NHap chuoi bat ki");
        String strings = scanner.nextLine();
        System.out.println("Nhap ky tu muon tim");
        char symBol = scanner.next().charAt(0);

        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == symBol) {
                count++;
            }
        }
        System.out.println("Tim thay "+ count + " chu "+ symBol+ " trong chuoi vua nhap");

    }

}
