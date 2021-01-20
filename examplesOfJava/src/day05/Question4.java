package day05;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        kullanıcıdan notunu alın ve harflendirme yapın
        1.50 den az -D 2.50 dahil c
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("gecerli bir not giriniz");
        } else if (num < 50) {
            System.out.println("D");
        } else if (num < 60) {
            System.out.println("C");
        } else if (num < 80) {
            System.out.println("B");
        } else if (num <= 100) {
            System.out.println("A");
        } else {
            System.out.println("gecerli not gir dedik");
        }
        scan.close();

    }
}
