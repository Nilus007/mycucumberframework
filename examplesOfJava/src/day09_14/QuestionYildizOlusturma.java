package day09_14;

import java.util.Scanner;

public class QuestionYildizOlusturma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= num - i; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();

    }
}
