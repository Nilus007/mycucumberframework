package day10_15;

import java.util.Scanner;

public class Simetrik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("bir String giriniz");
            String s = scan.nextLine();
            String ilkharf=s.substring(0,1);
            String sonharf=s.substring(s.length()-1);
            if (ilkharf.equals(sonharf)){
                System.out.println("simerik");
            }else{
                System.out.println("tekrar bir String giriniz");
            }
        }while(false);

    }

}
