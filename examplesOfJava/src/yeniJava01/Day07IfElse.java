package yeniJava01;

import java.util.Scanner;

public class Day07IfElse {
    /*
 Kullanıcıdan çocuğunun adını girmesini isteyin, ad “a” içeriyorsa çıktı “Bu ad 'a' içeriyor” olacaktır.
ad "z" içeriyorsa, çıktı "Bu ad "z" içerir." Aksi takdirde çıktı
"Bu ad ne 'a' ne de 'z' içeriyor."

     */
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("bir isim giriniz");
//        String name=scan.nextLine();

//        if(name.contains("a")){
//            System.out.println("Bu ad 'a' içeriyor");
//        } else if (name.contains("z")){
//            System.out.println("Bu ad \"z\" içerir.");
//
//        }else {
//            System.out.println("Bu ad ne 'a' ne de 'z' içeriyor.");
//        }
//

        /*
        Kullanıcıdan bir harf girmesini isteyin, büyük harf ise “F” den önce olup olmadığını alfabetik olarak kontrol edin.
Alfabetik sıraya göre “F”den önce ise çıktı “F’den önce büyük” olacaktır, aksi halde çıktı olacaktır.
"F'den sonra büyük." Küçük harf ise “h”den önce gelip gelmediğini alfabetik olarak kontrol edin.
Alfabetik sıraya göre “h”den önceyse çıktı “h'den önce küçük”, aksi takdirde “h'den sonra küçük” olacaktır.
         */

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir harf giriniz");
//        String harf = scan.nextLine();
////char harf=scan.next().charAt(0);
//        if (harf.charAt(0) >= 'A' && harf.charAt(0) <= 'Z') {
//            if (harf.charAt(0) < 'F') {
//                System.out.println("“F’den önce büyük”");
//
//            } else {
//                System.out.println("F'den sonra büyük.");
//            }
//        } else {
//            if (harf.charAt(0) < 'h'){
//                System.out.println("“h'den önce küçük”");
//            }else{
//                System.out.println("h'den sonra küçük");
//            }
//        }
//    }


    /*
    Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
rakamlarını ekrana yazdırın.
     */

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir kredi kartı numaranızı giriniz");
//        String krt=scan.nextLine();
//
//        System.out.print(krt.substring(2,4));
//        System.out.println(krt.charAt( krt.length()-1));

        /*
        Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("adınızı giriniz");
//        String ad=scan.nextLine();
//        System.out.println("soyadınızı giriniz");
//        String soyad=scan.nextLine();
//
//        System.out.println((ad.length())+(soyad.length()));

    /*
    Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise
ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("ülkenizi giriniz");
        String ulke = scan.nextLine();

        switch (ulke) {
            case "Amerika":
                System.out.println("USA");
                break;
            case "Ingiltere":
                System.out.println("UK");
                break;
            case "Almanya":
                System.out.println("DE");
                break;
            default:
                System.out.println("NA");
        }

        /*
        5)Kullanıcıdan yaşadığı ülkenin ismini alın
         bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.
         */
        System.out.println(ulke.substring(0,2).toUpperCase());

        /*
        Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi
        ile sondan ikinci harfini büyükk harf olarak ekrana yazdırın.
         */
        System.out.println(ulke.substring(1,2).toUpperCase()+ (ulke.substring(ulke.length()-1)).toUpperCase());
    }
}
