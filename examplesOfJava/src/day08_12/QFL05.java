package day08_12;

import java.util.Scanner;

public class QFL05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("baslangıc degeri giriniz");
        int bas=scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bit =scan.nextInt();


        int sum=0;

        for (int i=bas; i<=bit; i++){
            sum=sum+i;
        }
        System.out.println("sum: "+ sum);
        scan.close();
    }
}
