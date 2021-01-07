package day01Questions;

import java.util.Scanner;

public class Question05 {
    //kullaniciya gunde kac saat uyudugunu sorun,
    // ayda yilda ve 40 yılda kac gununu uykuda gectigini yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gunluk uyku degerinixzi giriniz");
        int u = scan.nextInt();
        System.out.println(" Ayda " + u * 30 / 24 + ", yilda " + u * 365 / 24 + ", 40 yilda " + u * 365 * 40 / 24 + "gununuz uykuda  geçiriyorsunuz");


    }
}
