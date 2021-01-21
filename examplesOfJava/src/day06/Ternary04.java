package day06;

import java.util.Scanner;

public class Ternary04 {
    /*
    kullanıcıdan alacagınız urun miktarı ve fiyatını alınız ve 1000 den
    fazla urun miktarı varsa 0.10 iridim yapın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("urun miktarını giriniz");
        int m = scan.nextInt();
        System.out.println("urun fiyatını giriniz");
        double f = scan.nextDouble();
        double sum=m>1000 ? m*0.9*f  :m*f;
        System.out.println(sum);
        scan.close();
    }
}
