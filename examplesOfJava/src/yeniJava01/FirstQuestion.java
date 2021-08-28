package yeniJava01;

import java.util.Scanner;

public class FirstQuestion {

    /*
    Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını
ekrana yazdıran bir program yazınız.
     */
    public static void main(String[] args) {

//        Scanner scan=new Scanner(System.in);
//        System.out.println("dort basmaklı bir sayı giriniz");
//        int sayi=scan.nextInt();
//
//        int first=sayi/1000;
//        int last=sayi %10;
//
//
//        int sum=first+last;
//
//        System.out.println("ilk rakam:" + first + ", son rakam: "+ last);
//
//        System.out.println("ilk rakam ve son rakamın toplamı: " + sum);


        /*
        Kullanıcının girdiği 3 basamaklı sayının tüm rakamlarının toplamını
ekrana yazdıran bir program yazınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("uç basmaklı bir sayı giriniz");
        int sayi = scan.nextInt();

        int ilk=sayi/100;
        int ikinci=(sayi/10)%10;
        int son=sayi%10;

        int sum=ikinci+ilk+son;
        System.out.println("ilk: " + ilk + "ikinci: " +ikinci+ "son: "+son);
        System.out.println("sum:"+sum);
    }
}
