package yeniJava01;

import java.util.Locale;
import java.util.Scanner;

public class Day03 {
    /*
    Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
“Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
     */

//    public static void main(String[] args){
//        Scanner scan= new Scanner(System.in);
//        System.out.println("bir tam sayı giriniz");
//        int num=scan.nextInt();
//
//        if(num<10 && num>=0){
//            System.out.println("girdiğiniz sayı rakamdır");
//        }else{
//            System.out.println("girdiğiniz sayı rakam degildir");
//        }



    /*
    Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.

     */



//        System.out.println("ucgenin kenar uzunluklarını girelim");
//        int ilk= scan.nextInt();
//        int sec=scan.nextInt();
//        int last=scan.nextInt();
//
//        if (ilk==sec && sec==last){
//            System.out.println("eskenar ucgen");
//        }else {
//            System.out.println("Eşkenar değil");
//        }

/*
Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
 */

//        Scanner scan= new Scanner(System.in);
//
//        System.out.println("urun miktarını giriniz");
//        int miktar=scan.nextInt();
//        System.out.println("urun fiyatını giriniz");
//        double fiyat=scan.nextDouble();
//
//        if (miktar>=1000){
//            double top=miktar*(fiyat*0.9);
//            System.out.println("toplam tutar: "+ top);
//        }else {
//            double top=miktar*fiyat;
//            System.out.println("toplam tutar: "+ top);
//
//        }
/*
Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
Diğer durumlarda ekrana “Harf değil” yazdırın.
 */

//        Scanner scan= new Scanner(System.in);
//        System.out.println("bir karakter giriniz");
//        char kar=scan.next().charAt(0);
//     //   String kar=scan.nextLine().toLowerCase();
//        if(kar>='a'& kar<='z'||kar>='A'& kar<='Z'){
//            System.out.println("girdiğiniz ifade harftir");
//        }else{
//            System.out.println("harf degildir");
//        }
        /*
        Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */

    public static void main(String[] args) {

         Scanner scan= new Scanner(System.in);

         System.out.println("password giriniz");
         int pwd=scan.nextInt();

         if (pwd %5==0){
             if(pwd % 10==0){
                 System.out.println("5 e bölünen çift sayı");
             }else{
                 System.out.println("5 e bolunen tek sayı");
             }

         }else{
             System.out.println("tekrar deneyiniz");
         }

}

}
