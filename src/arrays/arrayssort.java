package arrays;

import java.util.Arrays;

public class arrayssort {
    public static void main(String[] args) {
        int[] a={5,6,8,1,2,9};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] a){
        Arrays.sort(a);
        return a;
    }
}
