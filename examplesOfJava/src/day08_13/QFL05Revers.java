package day08_13;

import java.util.Locale;
import java.util.Scanner;

public class QFL05Revers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" bir sitring  giriniz");
        String word=scan.nextLine();
       for (int i=word.length()-1; i>=0; i--){
           System.out.print(word.toUpperCase().charAt(i));
       }
    }

}