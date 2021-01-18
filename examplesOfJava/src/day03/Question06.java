package day03;

import java.util.Scanner;

public class Question06 {
    /*
    yarı capı verilen dairenin cevresini hesaplıyalım
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir dairenin yarı capı veriniz");
        double yarıCap = scan.nextDouble();

        double cevre = 2 * 3.14 * yarıCap;
        double cevre1 = 2 * yarıCap * Math.PI;
        System.out.println(cevre);
        System.out.println(cevre1);


    }
}
