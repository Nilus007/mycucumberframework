package day05;

import java.util.Scanner;

public class IfElseQues {
    /*
    kullanıcıdan bir gun alın
    ve dini ozelliğine göre sınıflandirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün giriniz");
        String day = scan.nextLine();
        if (day.equalsIgnoreCase("cuma")) {
            System.out.println("muslimanlar icin kutsal gun");
        }
        if (day.equalsIgnoreCase("Cumartesi")) {
            System.out.println("hiristyanlar icin kutsal gun");
        }
        if (day.equalsIgnoreCase("pazar")) {
            System.out.println("yahudiler icin kutsal gun");
        }
        scan.close();



    }
}