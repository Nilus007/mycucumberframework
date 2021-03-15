package day04Practice;

import java.util.Scanner;

public class Question01 {
    /*
    kullanıcıdan bir syı isteyin girilen sayıya göre
    1
    12
    123
    1234
    12345
    123456

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sekil cizmek için bir tam sayi giriniz");
        int n = scan.nextInt();
        resimCiz(n);
        scan.close();
    }


    public static void resimCiz(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);    //  k yerine i yazıldıgında çıktı
                                        //  her satırda aynı sayı oluyor

            }
            System.out.println("");
        }
    }
}
