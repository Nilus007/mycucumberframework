package day09_14;

import java.util.Scanner;

public class Question01Mail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir email giriniz");
        String e = scan.nextLine();
        int  no=e.indexOf("@");
       if (!e.contains("@")){
           System.out.println("gecerli bir email giriniz");
       }else {
           if(e.substring(no+1).equals("gmail.com")){
               System.out.println("email onaylandı");
           }else{
               System.out.println("lutfen gmail hesabı giriniz");
           }
       }
       {


       }
    }
}
