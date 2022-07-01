package gfg;

import java.util.Arrays;

public class remove {
    public static int rev(int[] arr,int x)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=x) {
                arr[i] = arr[j];
                i++;
            }
        }
        for(int a:arr)
            System.out.print(a+" ");
        return i;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,7,8,8,9,0};
        int x=3;
        Arrays.sort(arr);
       int y= rev(arr,x);
//        System.out.println(y);

    }
}
