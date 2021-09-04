package yeniJava01;

import java.util.Scanner;

public class Day08_Loops {
    //kullanıcıdan ad soyad ve tc nosunu alın va çıktı olaarak trim buyukharf
    //ilk 7 hanesini yıldız yapın Ali Can ********1245
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String name=input.nextLine();
        System.out.println("SoyAdınızı giriniz");
        String lastna=input.nextLine();
        System.out.println("Tc giriniz");
        String tc=input.nextLine();

        String sonuc=name.substring(0,1).toUpperCase().trim()+name.substring(1).toLowerCase()
                +" "+lastna.substring(0,1).toUpperCase().trim()+lastna.substring(1).toLowerCase()
                +" "+tc.substring(0,7).replaceAll("\\d","*")+tc.substring(tc.length()-4);
        System.out.println(sonuc);
    }
}
