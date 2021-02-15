package day09_14;

import java.util.Scanner;

public class lastForLoop {
    /*
    1 2 3 4
    2 4 6 8
    3 6 9 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("10 sayısından kucuk bir sayı giriniz");
        int num = scan.nextInt();
        for (int i=1; i<=num; i++){

            for (int j=1; j<num; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }
}
