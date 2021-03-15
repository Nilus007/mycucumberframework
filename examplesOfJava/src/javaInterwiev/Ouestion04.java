package javaInterwiev;

import java.util.Scanner;

public class Ouestion04 {
    /*
   Write a Java Program to reverse a string (Stringi tersine ceviren java kodu yaziniz)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scanner.next();
        String ters=" ";
        for (int i=str.length()-1; i>=0; i--){
            ters=ters+str.charAt(i);
        }
        System.out.println(ters);
    }
}
