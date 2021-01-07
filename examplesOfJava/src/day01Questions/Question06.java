package day01Questions;

import java.util.Scanner;

public class Question06 {
    // kullanıcaya kac cay bardağı ve  seker ictigini sorun ve
    //yılda kac kilo seker tukettigini yazanız
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("gunlük çay miktarını giriniz");
        int caysayisi=scan.nextInt();
        System.out.println("caya kac seker atarsiniz");
        int sekersayisi=scan.nextInt();

        double sekerTuketimi=(365*caysayisi*sekersayisi*1.7)/1000;
        System.out.println("yilda "+sekerTuketimi+ " kg seker kullaniyorsunuz");
    }
}
