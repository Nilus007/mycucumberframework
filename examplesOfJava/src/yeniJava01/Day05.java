package yeniJava01;

import java.util.Locale;
import java.util.Scanner;

public class Day05 {
    /*
    Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil”
yazdırın.
     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("bir yıl giriniz");
//        int yil = input.nextInt();
//
//        String art=(yil%100!=0) ? (yil%4==0 ? "artik yil":"artık yil degil") : ("artık yil degil");
//
//        System.out.println(art);
//
//    }

    /*
    Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
    “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. “Pazar” ise ekrana
    “Hıristiyanlar için kutsal gün” yazdırın. Diler günler icin “Kutsal gün değil” yazdırın.
     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("bir gün giriniz");
//
//        String gun = input.nextLine().toLowerCase();
//
//        switch (gun) {
//            case "pazartesi":
//                System.out.println("haftanın 1. gunu");
//                break;
//            case "sali":
//                System.out.println("haftanın 2. gunu");
//                break;
//            case "cuma":
//                System.out.println("Müslümanlar için kutsal gün");
//                break;
//            case "cumartesi":
//                System.out.println("Museviler için kutsal gün");
//                break;
//            default:
//                System.out.println("Geçerli bir gün sayısı giriniz");
//        }

    /*
    Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
     */

    /*
    Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir harf giriniz");
       String harf=input.next().substring(0,1).toLowerCase();


        switch (harf){
            case "a":
                System.out.println("sesli harf");
                break;
            case "e":
                System.out.println("sesli harf");
                break;
            case "i":
                System.out.println("sesli harf");
                break;
            case "o":
                System.out.println("sesli harf");
                break;
            case "u":
                System.out.println("sesli harf");
                break;
            case "b":
                System.out.println("sessiz harf");
                break;
            case "c":
                System.out.println("sessiz harf");
                break;
            case "d":
                System.out.println("sessiz harf");
                break;
            case "f":
                System.out.println("sessiz harf");
                break;
            default:
                System.out.println("Geçersiz character");
        }

    }
}

