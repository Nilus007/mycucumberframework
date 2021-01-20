package day05;

import java.util.Scanner;

public class IfElse {
    /*
    kullanicidan bir sayi alınız ve onu ekrana yazdırınız

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        int n = scan.nextInt();
        if (n>=0){
            System.out.println(n);
        }else{
            System.out.println(-n);
        }
        scan.close();
    }
}
