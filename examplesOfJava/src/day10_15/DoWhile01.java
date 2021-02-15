package day10_15;

import java.util.Scanner;

public class DoWhile01 {
    /*
    kullanıcıdan bir string alın string içinde kactane
    harf,karakter, harfdışı karakter, rakam oldugunu brelirten
    code yaz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String sentences = scan.nextLine().toLowerCase();
        int harfcounter = 0;
        int rakamcounter = 0;
        int digercounter = 0;
        int k=0;
        do {
            if (sentences.charAt(k)>'a'&&sentences.charAt(k)<='z'){
                harfcounter++;
            }else if (sentences.charAt(k)>'0'&&sentences.charAt(k)<='9'){
                rakamcounter++;

            }else{
                digercounter++;
            }

            k++;
        } while (k<sentences.length());
        System.out.println("harf sayısı: " + harfcounter);
        System.out.println("rakam sayısı: " + rakamcounter);
        System.out.println("diger sayısı: " + digercounter);

    }
}
