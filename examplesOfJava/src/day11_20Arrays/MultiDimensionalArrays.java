package day11_20Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    /*
    assaagidaki array i iç arrayını toplayarak tek bir arrays olusturun
    {{10,20, 30}, {4}, {6, 7, 20}, {12, 3} };
     */
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {4}, {6, 7, 20}, {12, 3}};
        int sum = 0;
        int top[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                sum += arr[i][k];
            }
            top[i] = sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(top));
    }
}
