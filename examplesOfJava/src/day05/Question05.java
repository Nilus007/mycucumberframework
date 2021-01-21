package day05;

import java.util.Scanner;

public class Question05 {

    /*
    kullanıcıdan bir harf gir mesini isteyin
    girdiği harf ise "a" olup olmadığını kontrol et a ise ilk kucuk harf
    a degil ise ekrana ilk kucuk harf degil yazdırın aynı işlemi Z ile yapın

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char h = scan.next().charAt(0);
        if ((h >= 'a' && h <= 'z')) {
            if (h == 'a') {
                System.out.println("ilk kucuk harf");
            }else{
                System.out.println("ikl kucuk harf degil");
            }
        }else if(h>='A'&& h<='Z'){
if (h=='Z'){
    System.out.println("son buyuk harf");
}else{
    System.out.println("son buyuk harf degil");
}
        }else{
            System.out.println("lutfen harf giriniz");
        }
        scan.close();
    }

}
