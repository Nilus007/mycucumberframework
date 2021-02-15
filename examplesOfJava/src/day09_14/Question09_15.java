package day09_14;

import java.util.Locale;
import java.util.Scanner;

public class Question09_15 {
    public static void main(String[] args) {
        /*
        kullanıcıdan cumle ve bir harf alınız
         cumlede kacharf var bulup yazdırınalınız ve
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String w = scan.nextLine().toLowerCase();
        System.out.println("bir harf giriniz");
        String h=scan.next().substring(0, 1).toLowerCase();

        int counter=0;
         for (int i=0; i<=w.length()-1; i++){
             if(w.substring(i, i+1).equals(h)){
                 counter++;
             }

         }
        System.out.println(counter);
         scan.close();
    }
}
