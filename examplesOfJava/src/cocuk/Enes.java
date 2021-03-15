package cocuk;

import java.util.Scanner;

public class Enes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        double s= scan.nextDouble();
        double sayi=scan.nextDouble();
        System.out.println(" sayının bölümü: "+(s/sayi ));
    }
}
