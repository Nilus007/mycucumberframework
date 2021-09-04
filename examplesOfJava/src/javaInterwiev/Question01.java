package javaInterwiev;

import java.util.Scanner;

public class Question01 {
    /*
 Girilen sayinin Amstrong sayi olup olmadigini yazdiran java programi yaziniz
 Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num = input.nextInt();
        int tem =num;
        int sum = 0, r = 0;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + (r * r * r);


        }

        if (tem == sum) {
            System.out.println("sayı amstrong");
        } else {
            System.out.println("sayı amstrong degil");
        }

    }


    /*
 From a given array find all pairs whose sum is a given number
 {4, 6, 5, -10, 8, 5, 20} ==> 10
 For example;  4+6=10, 5+5=10, -10+20=10

    /*

		 * StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin

          ORNEK:

           INPUT      :  goat
                         photo
                         ghost
                         kalem

           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

}
