package day10_15;

import java.util.Scanner;

public class DoWhile03 {
    /*
    Kullanıcıya iki sayı girmesini söyleyin.
    Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
    Eşit değilse tekrar iki sayı girmesini söyleyin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one=0;
        int two=0;
        do {
            System.out.println("iki sayı giriniz");
            one=scan.nextInt();
            two=scan.nextInt();
            if (one==two){
                System.out.println("kare olusturdunuz");
            }
        }while (!(one==two));


    }
}
