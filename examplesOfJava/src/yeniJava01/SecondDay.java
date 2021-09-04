package yeniJava01;

import java.util.Scanner;

public class SecondDay {
    //Bir int variable oluşturunuz ve bu variable’ın değerini 3 farklı yoldan
    //   1 artırma
    public static void main(String[] args) {

/*
5)Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan
bir program yazınız. (float kullanınız)
Not 1: pi sayısı: 3.14159
Not 2: Alan: 3.14159 x radius x radius
Not 3: Cevre: 2 x 3.14159 x radius
 */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("dairenin yari capini giriniz");
//        int cap=scan.nextInt();
//
//        double alan= cap*cap*3.14;
//        double cevre= 2*3.14*cap;
//
//        System.out.println(" dairenin alanı: "+ alan + "\n" + "dairenin cevresi: "+ cevre);




/*
Kullanıcıdan “ * ” gibi bir sembol alin
2) Ekrana asagidaki
             *
            * *
           * * *
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("istediğiniz sembolu giriniz");
        char sekil = scan.next().charAt(0);
        System.out.println("  " + sekil + "\n" + " " + sekil + " " + sekil + "\n" + sekil + " " + sekil + " " + sekil);



        /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
         */
    }


}
