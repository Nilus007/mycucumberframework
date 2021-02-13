package day08_13;

import java.util.Scanner;

public class WLCarpımTaplosu {
    /*
    kullanıcıadan sayı alinız ve carpım toplsu olusturunuz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num = scan.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "x" + i + "=" + num * i);
            i++;
        }
    }
}
