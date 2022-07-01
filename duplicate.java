package gfg;

import java.util.Arrays;
import java.util.Collection;

public class duplicate {
        public static void remove(int [] arr) {
            if (arr.length == 0)
                System.out.println(0);
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }

            for(int x:arr)
            {
                System.out.print(x+" ");
            }
        }
    public static void main(String[] args) {
        int [] arr= {12,2,3,45,6,7,4,6,6,12,3};
        Arrays.sort(arr);
        remove(arr);
    }
}
