package day10_15;

import java.util.Scanner;

public class DoWhile02 {
    /*
    girilen sayıları sıfır girilinceye kadar toplama
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i=1;
        int num=0;
        do {
            System.out.println("bir sayı giriniz");
            i= scan.nextInt();
            num+=i;
        } while (!(i==0));

        System.out.println(num);
    }

}
