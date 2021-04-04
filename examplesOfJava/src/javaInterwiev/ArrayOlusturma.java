package javaInterwiev;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("arayin uzunlugunu girin ");
        int arrlenght = scanner.nextInt();
        int arr[] = new int[arrlenght];

        System.out.println("array elemanını giriniz");
        for (int i = 0; i < arrlenght; i++) {
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }

}
