package day10_15;

import java.util.Scanner;

public class DoWhile04 {
    /*
    Kullanıcıya bir String girmesini söyleyin ve
    bu String’i yukarıdan aşağıya doğru yazdıran
    Program yazınız. Ornegin; CAN ==>   C
                                        A
                                        N
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("bir string giriniz");
            String c = scan.nextLine().toUpperCase();
            for (int i = 0; i < c.length(); i++) {

                System.out.println(c.charAt(i));
            }
        }
    }

