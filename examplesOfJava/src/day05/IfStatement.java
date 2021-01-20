package day05;

import java.util.Scanner;

public class IfStatement {
    /* kullanıcıdan bir sayi alin
    sayi cif ise cosole cift tek ise tek yazdırın

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login a number");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " cift satısır");
        }
        if (num % 2 != 0) {
            System.out.println(num + " tek sayidır");
        }
        scan.close();
    }
}
