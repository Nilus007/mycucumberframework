package day11_20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion {
    /*
    bir stringde kullanılan tum haarflerin sayılarını gösteren
    kodu yazdırın alaaddin>> a=3, d=2 gibi
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String c = scan.nextLine();

        String ch[] = c.split("");
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));
        int counter = 0;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1].equals(ch[i])) {
                counter++;
            }else{
                System.out.println(ch[i - 1] +  "in sayisi:" + (counter+1));
                counter=0;

            }
            if (i==ch.length-1){
                System.out.println(ch[i - 1] +  " in sayisi:"+ (counter+1));
            }

        }
        scan.close();
    }
}
