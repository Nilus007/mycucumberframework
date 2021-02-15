package day08_13;

import java.util.Scanner;

public class QFL03 {
    /*
        *
       * *
     *  *  *
   *  *  *   *

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int k = sayi - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        scan.close();
    }
}


