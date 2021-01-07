package day01Questions;

import java.util.Scanner;

public class Question03 {
    //kullanicidan boy ve kilosunu aliniz ve
    // vucut kutle endeksini bulunuz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("boyunuzu cm olarka giriniz");
        double weight = scan.nextDouble();
        System.out.println("kilonuzu Kg olarak giriniz");
        double height = scan.nextDouble();

        // boyu cm olarak aldik ama metreye cevirmemiz gerekiyor
        // boy=boy/100==> boy/=100

        double vke = weight/(height*height);
        System.out.println("vucut kutle endeksi:" + vke);


    }
}
