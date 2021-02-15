package day10_15;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String c = scan.nextLine().toLowerCase();
        System.out.println("bir harf giriniz");
        String h = scan.next().toLowerCase();
        int harfcounter=0;
        for (int i=0; i<c.length(); i++){
            if (c.substring(i, i+1).equals(h)){
                harfcounter++;

            }
            }
        System.out.println(harfcounter);
        }
    }

