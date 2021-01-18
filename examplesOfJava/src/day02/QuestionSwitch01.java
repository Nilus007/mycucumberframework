package day02;

import java.util.Scanner;

public class QuestionSwitch01 {
    /*
    kullanicidan iki tam sayi ve islem cinsini alın ve
    sayılari kullanicinin belirlediği isleme tabi tutup sonucu yazdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        System.out.println("bir islem giriniz: \n1:toplama 2 cıkarma  3:carpma 4:bolme");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
                break;
            case 2:
                System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
                break;
            case 3:
                System.out.println(s1 + " * " + s2 + " = " + (s1 * s2));
                break;
            case 4:
                System.out.println(s1 + " / " + s2 + " = " + (s1 / s2));
                break;
            default:
                System.out.println("lutfen gecerli bir işlem secımız");

        }


    }


}

