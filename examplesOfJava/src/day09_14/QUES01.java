package day09_14;

import java.util.Scanner;

public class QUES01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 harften fazla bir kelime giriniz");
        String w = scan.nextLine();
        System.out.println("10 dan kucuk bir sayı giriniz");
        int num = scan.nextInt();

        String sonh = w.substring(w.length() - 2);
         for (int i=0; i<=num; i++){
             System.out.print(sonh+ " " );
         }
         scan.close();

    }


}
