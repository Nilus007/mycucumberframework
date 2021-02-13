package day08_12;

import java.util.Scanner;

public class QuestionFoorLoop01 {
    /*
    başlangıc degerinden bitişe kadar tüm çift sayılar

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("baslangıc degeri giriniz");
        int bas=scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bit=scan.nextInt();
         if (bas>bit){
             System.out.println("baslangıc degeri bitis degerinden kucuk olmalı");
         }else{
             for (int i=bas; i<=bit; i++){
                 if (i%2==0) {
                     System.out.print(i+" ");
                 }
             }
         }
         scan.close();
    }
}
