package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDublicateSortArrray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,10,60,30,40};
        Set<Integer> set =new TreeSet<>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println("DefaultTreeset:"+set);
        //Arrays.sort(a);
    }

}
