package day04;

import java.util.Scanner;

public class Question01 {
    /*
    kullanıcının girdiği 4 basamaklı sayının ,ilk ve son rakamının
    toplamını ekrana yazdıran programı yazınız
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int s = scan.nextInt();
        int sonRakam = s % 10;
        int ilkRakam = s / 1000;

        System.out.println("ilk ve son rakam toplamı=" + (sonRakam + ilkRakam));
        scan.close();
    }
}
