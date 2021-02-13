package day08_13;

import java.util.Scanner;

public class QFL01 {
    /*
    kullanıcıdan baslangıc ve bitiş harflerini alin ve
    baslangıc  harfinden baslayip bitis harflerine kadar
    butun harfleri yazdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baslangıc harfi giriniz");
        char bas = scan.next().toUpperCase().charAt(0);
        System.out.println("son harfi giriniz");
        char bit = scan.next().toUpperCase().charAt(0);

        if (bas <= bit) {
            for (char i = bas; i <= bit; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = bas; i >= bit; i--) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
