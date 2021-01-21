package day06;

import java.util.Scanner;

public class Ternary03 {
    /*
    kullanıcıdan bir ucgenin üçkenar uzunlugunu alın
    ve ikiz kenar durumuna bakın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenın uc kenarını giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();
        String r = k1 == k2 || k2 == k3 || k3 == k1 ? "ikiz kenar" : "ikizkenar degil";
        System.out.println(r);
        scan.close();
    }
}
