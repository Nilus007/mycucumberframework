package day09_14;

import java.util.Scanner;

public class DoWhile {
    /*
    kullanıcıdan sayi isteyin ve
    girdiği sayıları toplayın ve yeniden isteyin
     */
    public static void main(String[] args) {
       int  sum=0;
       int counter=0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayı giriniz");
            int num = scan.nextInt();
            sum+=num;
            System.out.println("sayıların toplamı:"+ sum);
            counter++;
        }
        while (sum<100);
        System.out.println(counter);
    }
}
