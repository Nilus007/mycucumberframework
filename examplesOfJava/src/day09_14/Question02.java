package day09_14;

import java.util.Scanner;

public class Question02 {
    /*
    kullanıcıdan isim ve soy isim alın ve 
    kullnıcını ilk ismin den soy isminin son harfine kadar
    isimleri buyuk harfle yazdırın
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        char i = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("soyisminizi giriniz");
        String s = scan.nextLine().toUpperCase();
        char sonkarakter = s.charAt(s.length() - 1);
        if (i <= sonkarakter) {
            while (i <= sonkarakter) {
                System.out.print(i + " ");
                i++;
            }
        } else {
            while (sonkarakter <= i) {
                System.out.print(sonkarakter + " ");
                sonkarakter++;
            }
        }

        scan.close();
    }
}
