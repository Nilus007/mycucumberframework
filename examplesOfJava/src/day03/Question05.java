package day03;

import java.util.Scanner;

public class Question05 {
    /*
    ogrencideen vize final ve vize notu aalalım yıl sonu notunu yazdıralım

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please login FİNAL,midterm and project notes");
        double midtermNote=scan.nextDouble();
        double finalNote=scan.nextDouble();
        double projectNote=scan.nextDouble();
        double lastNote=(midtermNote*0.3)+(projectNote*0.2)+(finalNote*0.5);
        System.out.println( "term note=" + lastNote);
    }
}
