package day05;

import java.util.Scanner;

public class IfElse01 {
    /*
    kullanicidan ürün miktarını alın ve 1000 den
    fazla ise 0.10 indirim yapınız

    stack memory icerisine primitive and non primitivelerin adresleri var
    heap memory icerisinde non primitive data typeları vardır.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("miktarı giriniz");
        int m = scan.nextInt();
        System.out.println("fiktarı giriniz");
        double prc = scan.nextDouble();

        if (m>1000){
            System.out.println("%10 indirimli fiyat:" + prc*0.9*m);
        }else{
            System.out.println( "indirimsiz fiyat" + prc*prc);
            scan.close();

        }
    }
}
