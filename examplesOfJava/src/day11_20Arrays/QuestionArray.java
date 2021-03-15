package day11_20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionArray {
    /*
    Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
    eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
    “Aynı eleman yok” yazdırınız.
     */
    public static void main(String[] args) {

        int arr[]={1, 2, 3, 4, 8, 4, 3, 5 , 4, 8, 9, 41, 4, 1, 7};

        int counter = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]==(arr[i])) {
                System.out.println("Aynı eleman var");
            }else {
                System.out.println("Aynı eleman yok");

            }
        }

    }
}
