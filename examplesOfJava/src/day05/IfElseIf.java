package day05;

import java.util.Scanner;

public class IfElseIf {
    /*
    kullanıcıdan bir tam sayı alın ve sayının ne oldugunu anlatın

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        double n=scan.nextDouble();
        if (n<0){
            System.out.println("negatif");
        }else if(n==0){
            System.out.println("notr");
        }else{
            System.out.println("pozitif");
        }
        scan.close();

    }
}
