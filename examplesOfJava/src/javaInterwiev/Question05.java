package javaInterwiev;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Question05 {
      /*
  kullanicidan iiki string aliniz
  Stringlerim karakterleri ayni ise "Anagram" degil ise anagram degil yazdirin.
  ornek; "Mary" and "army" and "RAMY" are Anagrams.
     */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Lutfen iki string giriniz");
          String s1 = scan.nextLine().toLowerCase();
          String s2 = scan.nextLine().toLowerCase();

          String arr1[] = s1.split("");
          Arrays.sort(arr1);

          String arr2[] = s2.split("");
          Arrays.sort(arr2);

          if(s1.length() != s2.length()){
              System.out.println("Girilen strinler Anagram degildir");
          }else if (s1.isEmpty() || s2.isEmpty()){
              System.out.println("Girilen strinler Anagram degildir");
          }else if (Arrays.equals(arr1 ,arr2)){
              System.out.println("Girilen strinler Anagram'dir");
          }else {
              System.out.println("Girilen strinler Anagram degildir");
          }

      }

}