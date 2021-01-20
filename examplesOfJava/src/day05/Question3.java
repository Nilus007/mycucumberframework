package day05;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarını giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

        if (k1==k2&& k2==k3){
            System.out.println("eskenar");
        }else if (k2==k1 || k2==k3 || k1==k3){
            System.out.println("ikizkenar");
        }else{
            System.out.println("ceşitkenar");
        }
        scan.close();


    }
}
