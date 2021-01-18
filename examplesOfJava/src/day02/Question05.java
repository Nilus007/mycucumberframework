package day02;

import java.util.Scanner;

public class Question05 {
    /*
    Final notu proje notu ve vize notunu giren ogrencinin
    yıl sonu notunu bulunuz ve 50 barajı üzerinden degerlendiriniz
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("proje notunuzu giriniz");
        double prj = scan.nextDouble();
        System.out.println("vize notunuzu giriniz");
        double vz = scan.nextDouble();
        System.out.println("final notunuzu giriniz");
        double fnl = scan.nextDouble();
        double donemnotu = ((prj * 20) / 100 + (vz * 30) / 100 + (fnl * 50) / 100);
        System.out.println(donemnotu);
        if (donemnotu < 50) {
            System.out.println("dersten kaldınız");
        } else {
            System.out.println("dersten gectiniz");
        }

    }
}
