package javaInterwiev;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz ");
        String str=scanner.next();

        StringBuilder strTers=new StringBuilder();
        strTers.append(str);
        System.out.println(strTers.reverse());

        // other way
        String tersempty="";
        for (int i=str.length()-1; i>=0; i--){
           tersempty=tersempty+str.charAt(i);
        }
        System.out.println(tersempty);
        reverseString(str);
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String tersempty1="";
        for (int i=str.length()-1; i>=0; i--){
            tersempty1=tersempty1+str.charAt(i);
        }
        System.out.println(tersempty1);
        return str;
    }
}
