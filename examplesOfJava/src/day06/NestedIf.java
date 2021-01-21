package day06;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
    /*
    KULLANICIDA PASSWORD Girmesşni isteyin
    girdiği paswor 5 e bolunuyorsa son rakamı kontrol edin
    son rakamı 0 ise ekrana "5 e bölunrn cif sayı
    son rakamı 0 degilse 5 e bolunen tek sayı yazdırın
    girdiği pasword 5 e bolunmuyorsa ekrana tekrar deneyin yazdırın.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamaklı pasword giriniz");
        int n = scan.nextInt();
        if (n % 5 == 0) {
            if (n % 10 == 0) {
                System.out.println("5 e bolunen cift sayı");
            } else {
                System.out.println("5 e bolunen tek sayı");
            }
        } else {
            System.out.println("gecerli bir pasword giriniz");
        }
        scan.close();
    }
}
