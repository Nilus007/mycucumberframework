package day04Practice;

import java.util.Scanner;

public class Question02 {
    /*
    kullanıcıdan toplamak istediği sayilari isteyen,
    girilen sayilarin adedini ve toplamini veren sayi yazdirin

     */
    public static void main(String[] args) {
        toplama();

    }
    public static void toplama(){
        int n=0;
        int sum=0;
        int counter=0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("toplamak için bir  sayi giriniz bitirmek için 0 a basınız");
            n = scan.nextInt();
            sum+=n;
            counter++;


        }while(n!=0);
        System.out.println("girdiginiz " + (counter-1) + " sayinin toplami "+ sum + " dir");

    }
}
