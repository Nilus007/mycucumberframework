package day01Questions;

import java.util.Scanner;

public class Question07 {

    // kullanicidan 3 kelime isteyin ve cumle olarak yazdırip sonuna . koyunuz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cumle halinde yazmak icin 1 kelime giriniz");
        String word = scan.next();
        System.out.println("lutfen cumle halinde yazmak icin 2. kelime giriniz");
        String word2 = scan.next();
        System.out.println("lutfen cumle halinde yazmak icin 3. kelime giriniz");
        String word3 = scan.next();

        System.out.println(word +" " +word2+" "+word3+ ".");
    }
}
