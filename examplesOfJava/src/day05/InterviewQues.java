package day05;

import java.util.Scanner;

public class InterviewQues {

    /*
        a varible 12, b variable 25 you
        code that is a is 25, b is 12 and
        user should login names
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("login two number");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("a :" + a);
        System.out.println("b: "+ b);
        System.out.println();
        double temporary = 0;
        temporary = a;            // temporary=12    a=12
        a=b;                      //temp=12          a=25   b=25
        b=temporary;              //tem=12           a=25   b=12
        System.out.println("a :" + a);
        System.out.println("b: "+ b);

        System.out.println();
        //2. method
        System.out.println("a :" + a);
        System.out.println("b: "+ b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a :" + a);
        System.out.println("b: "+ b);



    }
}