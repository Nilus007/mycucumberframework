package day12;

public class Multidimensional {
    /*
multi arrayin tüm elemanlarını toplama
 */
    public static void main(String[] args) {
        int ma[][] = {{2, 3, 2}, {2, 5, 1}};
        int sum = 0;

        for (int i = 0; i < ma.length; i++) {
            for (int k = 0; k < ma[i].length; k++) {
                sum = sum + ma[i][k];
            }
        }
        System.out.println(sum);
    }
}
