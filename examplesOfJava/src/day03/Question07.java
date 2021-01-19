package day03;

import java.util.Scanner;

public class Question07 {
    /*
    kullanıcan bir karenin uzun ve kısa kenarını alın ve
    karanin alanı ve cevresini yazan bir program olusturun
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please login a short  measerument of squire");
        double sk = scan.nextDouble();
        System.out.println("please login a height  measerument of squire");
        double hk = scan.nextDouble();
        double cevre = (2 *sk)+(2*hk);
        double alan = sk * hk;
        System.out.println("karenin cevresi=" + cevre);
        System.out.println("karenin alanı=" + alan);

    }
}
