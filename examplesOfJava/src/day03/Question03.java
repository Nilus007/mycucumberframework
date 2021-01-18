package day03;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        /*
        kullanıcıdan ad ve soy adının ilk degerini yazdırma
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ad ve soy adınızı  giriniz");
        String name = scan.next();
        String lastna = scan.next();
        char ilk = name.charAt(0);
        char son = lastna.charAt(0);
        System.out.println("isminizin ilk harfi:" + ilk + " dir."+"\n"+" Soy isminizin ilk harfi:" + son + " dir.");


    }
}
