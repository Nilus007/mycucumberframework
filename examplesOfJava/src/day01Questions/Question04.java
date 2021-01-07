package day01Questions;

import java.util.Scanner;

public class Question04 {
    // kullanıcıdan 3 tam sayı alınve
    // bu sayilarin ortalamasını bulun
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("ortamalama hesaplamak icin  3 adet tam sayi giriniz");
   int int1=scan.nextInt();
   int int2= scan.nextInt();
   int int3=scan.nextInt();

   double ort=(int1+int2+int3)/3;
        System.out.println("Girdiginiz "+int1+" "+int2+" ve "+int3+" ortalamasi" +ort+"dir");
    }
}
