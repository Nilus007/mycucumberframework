package day06;

import java.util.Scanner;

public class NestedTernary02 {
    /*
    artık yıl 1oo e bolunenlerden 4  yuze bolunen artık yıl
    100 e bolunemiyen 4 e bölununler
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int y = scan.nextInt();
        String r=y%100==0 ? y%400==0 ? "artık yıl": "artık yıl degil" : y%4==0 ? "artık yıl" : "artık yıl degil";
        System.out.println(r);
        scan.close();
    }
}
