package day08_12;

import java.util.Scanner;

public class QuestionForLoop02 {
    /*
    kullanıcıdan bir sayı alın ve  sayıları buyukten  kucuge yazdırın
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
         if (sayi<0){
             System.out.println("positive sayı giriniz");
         }else {
             for (int i=sayi; i>0; i--){
                 if (i%2!=0){
                     System.out.print(i+ " ");
                 }
             }
         }
    }
}
