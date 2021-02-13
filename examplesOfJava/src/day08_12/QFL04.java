package day08_12;

import java.util.Scanner;

public class QFL04 {
    /*
    kullanıcıdan baslangıc ve bitis degeri alın ve
    baslangıctan bitise kadar tum sayıların carpımını yazdırın

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baslangıc degeri giriniz");
        int bas = scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bit = scan.nextInt();

        int carpim = 1;
        if (bas < bit) {
            for (int i = bas; i <= bit; i++) {
                carpim = carpim * i;
            }

        } else {
            for (int i = bas; i >= bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.println("carpim: " + carpim);
        scan.close();
    }

}
