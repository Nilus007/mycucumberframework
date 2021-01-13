package day02;

import java.util.Scanner;

public class Question02 {
    /*
    kullanıcıya kullandığı şeker sayısını
    sorunuz ve kullanıcı her cayına 2 seker
    atmasıyla ne kadar seker kullandıgını yaziniz
    1 seker 1.7 gr
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gunde kac say icersiniz ");
        int tea = scan.nextInt();
        System.out.println("cayınıza kac seker atarsınız");
        double sugar = scan.nextDouble();
        double oneYear = (sugar * tea) * (1.7 / 1000) * 365;

if (sugar==0){
    System.out.println("cok guzel saglıklısınız");
}else {
    System.out.println("yilda" + oneYear + " seker kullanıyorsunuz");
}
    }

}