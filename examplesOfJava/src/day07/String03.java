package day07;

import java.util.Scanner;

public class String03 {
    /*
    kullanıcıdan ad ve soyadını ve 11 hanelı kımlık no alınız
    kullanıcı ad ve soy adını yazarken basa ve sona bosluk yazarsa silin
    ad ve soy adın ikl harflerri buyuk digerleri kucuk olmalı
    kımlık nonıun son 4 rakamı * konmalı
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ad giriniz");
        String ad = scan.nextLine();
        System.out.println("soyad giriniz");
        String soy = scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kml = scan.next();
        // 2.step

        ad = ad.trim();
        soy = soy.trim();
        //3.step

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soy = soy.substring(0, 1).toUpperCase() + soy.substring(1).toLowerCase();
        //4.step
        kml = "*******" + kml.substring(kml.length() - 4);
        // kml=kml.substring(0,7).replaceAll("\\d", "*")+ son haneler eklenecek;
        scan.close();
    }
}
