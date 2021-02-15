package day09_14;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num = scan.nextInt();
        int bolenlerinTop=0;
        for (int i=1; i<num; i++){
            if (num%i==0){
                bolenlerinTop+=i;
            }
        }
        if (bolenlerinTop==num){
            System.out.println(num + "mukemmel");
        }else{
            System.out.println(num + "mukemmel sayi  degildir");
        }
        scan.close();
    }
}
