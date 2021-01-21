package day06;

import java.util.Scanner;

public class Ternary01 {
    /*
    kullanıcıdan bir tam sayı alın ve durumunu yazdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        int n = scan.nextInt();
        System.out.println(n < 0 ? "negative sayı" : "positive sayi");
        scan.close();
    }
}
