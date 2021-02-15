package day09_14;

import java.util.Scanner;

public class QuestionWL02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num = scan.nextInt();
        for (int i=1; i<=num; i++){
            if (i%3==0 && i%5==0){
                System.out.println("JAVA OGRENİYOM");
            }else if(i%3==0){
                System.out.println("java");
            }else if(i%5==0){
                System.out.println("ogreniyorum");
            }else{
                System.out.println(i+ " ");
            }
        }
        scan.close();
    }
}
