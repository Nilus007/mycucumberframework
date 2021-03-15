package day10_15;

import java.util.Scanner;

public class Simetrik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =" ";
        String ilkharf = " ";
        String sonharf = " ";
        do {
            System.out.println("bir String giriniz");
            s = scan.nextLine();
            ilkharf = s.substring(0, 1);
            sonharf = s.substring(s.length() - 1);
            if (ilkharf.equals(sonharf)) {
                System.out.println("simerik");

            }
        } while (!(ilkharf.equals(sonharf)));

    }

}
