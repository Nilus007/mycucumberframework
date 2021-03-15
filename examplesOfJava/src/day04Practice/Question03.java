package day04Practice;

import java.util.Scanner;

public class Question03 {

    /*
    kullanıcıdan 100 den küçük sayi isteyin ve bu sayinin önceden
    tanimlanmış array de olup kullaniciya dönen bir method yaziniz.
     */
    public static void main(String[] args) {
        int[] array1 = {3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95};
        kontrol(array1);

    }

    public static void kontrol(int[] array1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();
        int flag=0;
        for (int i = 0; i < array1.length; i++) {
            if (n == array1[i]) {
                System.out.println("girdiğiniz sayi arrayde var");
                flag++;
                break;

            }
        }if (flag==0){
            System.out.println("girdiğiniz sayı arrayde yok");
        }
        scan.close();
    }
}

