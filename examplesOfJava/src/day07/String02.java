package day07;

import java.util.Scanner;

public class String02 {
    /*
    kullanıcıdan bir pasword alınız
    paswordun 1. karakteri buyuk harf
    son karakteri sayi
    en az 6 karakter olacak
    bu sartları saglayıp saglamadıgında mesaj olusturunuz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir password giriniz");
        String psw=scan.nextLine();
       if      ((psw.charAt(0)>='A'&& psw.charAt(0)<='Z') &&
               (psw.charAt(psw.length()-1)>='0' && psw.charAt(psw.length()-1)<='9')
                && psw.length()>5) {
           System.out.println("pasword basrı ile olusturuldu");

       }else{
           System.out.println("tekrar deneyiniz");
       }
       scan.close();
    }
}
