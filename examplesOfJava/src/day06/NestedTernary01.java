package day06;

import java.util.Scanner;

public class NestedTernary01 {
    /*
    kullanıcıdan bir tam sayı isteyin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        int n = scan.nextInt();
        String r=n>99 && n<1000 ? "uc basamaklı bir sayı" : (n%2==0 ? "uc basmaklı olmayan cift" : "uc basmaklı olmayan tek");
        System.out.println(r);
        scan.close();
    }
}
