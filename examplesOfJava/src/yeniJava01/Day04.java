package yeniJava01;

import java.util.Scanner;

public class Day04 {

    /*
    Kullanıcıdan bir tamsayı girmesini isteyin, tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek”
yazdırın.
     */
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("bir tam sayı giriniz");
//        int num=scan.nextInt();
//
//        String sonuc=((num%2==0) ? ("çift sayı" ):("tek sayı"));
//        System.out.println(sonuc);

    /*
    Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
     */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("iki tane tam sayı giriniz");
//        int num1=scan.nextInt();
//        int num2=scan.nextInt();
//
//        System.out.println((num1<num2)? (num2):(num1));

   /*
   Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.


    */
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("tam tam sayı giriniz");
//        int sayi=scan.nextInt();
//
//        System.out.println(sayi>=0 ? sayi: (-1*sayi));


        /*
        Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("tam tam sayı giriniz");
        int sayi=scan.nextInt();

        String sonuc= (sayi>99&&sayi<1000)? "3 basamaklı sayi":( sayi%2==0)? "3 basamaklı olömayan cift sayi": "3 basamaklı olmayan tek sayı";
        System.out.println(sonuc);
    }


}
