package day09_14;

import java.util.Scanner;

public class QDW01 {
    /* kullanıcıdan sayı alınız
    sayi 10 dan kucuk ise ekraana kazandınız yazdırın
    sayi 10 veya 10 dan buyuk ise ekrana sayi giriniz yazdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s=0;
        do {
            System.out.println("bir sayı giriniz");
            int n = scan.nextInt();
        }while (s>=10);
        System.out.println("kazandınız!");
        scan.close();
    }
}
