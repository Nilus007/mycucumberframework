package javaInterwiev;

import java.util.Scanner;

public class Question03 {
    /*
   kullanicinin girdigi sayiya kadar fibonacci sayisi yazdiran kod yaziniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi girin ");
        int number = scan.nextInt();
        fibonacci(number);
        scan.close();
    }
    public static void fibonacci(int number) {
        int fibo1 = 1;
        int fibo2 = 1;
        int ilk = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i <= number-2; i++) {
            ilk = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = ilk;
            System.out.print(ilk + " ");
        }
    }
}
