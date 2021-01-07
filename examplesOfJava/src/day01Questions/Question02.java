package day01Questions;

import java.util.Scanner;

public class Question02 {
    //kulanicidan character girmesini isteyiniz
    //ve girilen karakteri ve ascii degerini hesaplayiniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ascii degerini gormek icin bir character giriniz");
        char chr = input.next().charAt(0);
        int asciiValue=chr;
        System.out.println(asciiValue);

    }
}
