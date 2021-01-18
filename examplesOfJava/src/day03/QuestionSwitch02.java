package day03;

import java.util.Scanner;

public class QuestionSwitch02 {
    public static void main(String[] args) {

        //    User login the number of week, program send the name of day
        Scanner scan = new Scanner(System.in);
        System.out.println("please login a number from 1 to 7");
        int dayNum = scan.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:


        }

    }


}