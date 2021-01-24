package day07;

import java.util.Scanner;

public class String04 {
    /* kullanıcıdan bir string al ve
     * tum rakamları "*" a cevir
     * bas ve sondakı tım spaceleri sil
     * aradaki tum spaceleri! cevir
     * a ve z harflerini buyuk yap digerlerini kucuk yap
     * en basa ve en sona "()" ekleyin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s = scan.nextLine();
        s.replaceAll("\\d", "*");
        s = s.trim();
        s = s.replace(" ", "!");
        s = s.toLowerCase();
        s = s.replace('a', 'A');
        s = s.replace('z', 'Z');
        s = "(".concat(s).concat(")");
        System.out.println(s);
        scan.close();
    }
}
