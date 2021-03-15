package javaInterwiev;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question02 {
    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
    // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
    // java programi yazin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz arrayin uzunlugunu giriniz");
        int arrLen = scanner.nextInt();

        int arr[] = new int[arrLen];


        System.out.println("Girdiginiz sayi kadar array elemani ekleyiniz");

        for (int i = 0 ; i < arrLen ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));  // array elemanlarini kucukten buyuge siralar

        int fark = arr[arr.length-1]-arr[0];

        System.out.println("girilen array elemanlarinin en buyuk ile en kucuk elemani arasindaki fark " + fark);

        scanner.close();

    }
}
