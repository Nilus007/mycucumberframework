package yeniJava01;

import java.util.Scanner;

public class Day06Karisik {
/*
Ask user to enter a word which has 4 letters and output will be inverse of the word.
For example; if user enters “MARK” output will be “KRAM”
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime = scanner.nextLine();

//        String reverse = "";
//
//        for (int i = kelime.length() - 1; i >= 0; i--) {
//            reverse = reverse + kelime.charAt(i);
//        }
//        System.out.println(reverse);

        /*
        Ask user to enter a String and output will be the number of the characters in the String.
         */
//        System.out.println(kelime.length());

        int count=0;

        for (int i=0; i<kelime.length(); i++){
            count++;
        }
        System.out.println(count);


//    Ask user to enter password, if the password is okay for the following conditions output will be
//    “Your password is created successfully.” If the password is not okay for any of the following conditions
//    Output will be “Enter a new password according to the give conditions”
//
//            1.First letter must be uppercase
//            2.Last letter must be lowercase
//            3.Password must contain 6 characters


//        public static void main (String[]args){
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Bir password giriniz");
//            String pwd = scanner.nextLine();
//
//            if ((pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') && (pwd.charAt(pwd.length() - 1) >= 'a' && pwd.length() - 1 <= 'z') && pwd.length() == 6) {
//                System.out.println("Your password is created successfully");
//
//            } else {
//                System.out.println("Enter a new password according to the give conditions");
//            }
//        }
    }}
