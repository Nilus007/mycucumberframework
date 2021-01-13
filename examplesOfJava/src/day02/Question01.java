package day02;

import java.util.Scanner;

public class Question01 {
    /*
    kullanıcıdan boyunu ve kilosunun
    alarak vucut kutle endeksini bulunuz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen boyunuzu santimetre olarak giriniz");
        double boy = scan.nextInt();
        System.out.println("kilonuzu giriniz (kg)");
        double kilo = scan.nextDouble();
        boy/=100;
        double vke=kilo/(boy*boy);
        if (vke<20){
            System.out.println("vucut kutle endeksiniz" + vke +" , zayifsiniz");
        }else if (vke<25&&vke>20){
            System.out.println("vucut kutle endeksiniz" + vke +" , saglıklısınız");
        }else if (vke>25 && vke<30){
            System.out.println("vucut kutle endeksiniz " + vke +" , kilolusunuz");
        }else{
            System.out.println("vucut kutle endeksiniz " + vke +" , sismansınız");
        }
        
    }
}



