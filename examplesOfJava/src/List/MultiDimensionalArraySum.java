package List;

public class MultiDimensionalArraySum {
    public static void main(String[] args) {
        int arr[][]={{2,3}, {4}, {5,6,7}};
        int carp=1;
        for (int[] w: arr){
            for (int t : w){
                carp=carp*t;
            }
        }
        System.out.println(carp);
    }
}
