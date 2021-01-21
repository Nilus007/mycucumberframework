package day06;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        int s = scan.nextInt();
        String result= s>9 ? "rakam degil" : "rakam";
        System.out.println(result);
        scan.close();
    }
}
