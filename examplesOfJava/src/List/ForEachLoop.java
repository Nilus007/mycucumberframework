package List;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        ll.add(3);
        ll.add(5);
        ll.add(8);
        System.out.println(ll);
        for (Integer w : ll){
            System.out.print(w + " ");
        }
        System.out.println();
        int sum=0;
        for (Integer w : ll){
            sum=sum+w;
        }
        System.out.println(sum);
    }
}
