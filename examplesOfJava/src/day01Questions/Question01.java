package day01Questions;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        // kullanıcıdan bir tam sayi girmesini isteyin ve sayiyin icinden
        // bir kucuk sayi ve bir buyuk sayi ile carpıp sonucu yazdiralim

        Scanner input =new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int number=input.nextInt();
        System.out.println((number+1)*(number)*(number-1) +" ("+(number-1)+"*"+number+ "*"+(number+1)+")");


        System.out.println();
    }

}
