package gfg;

import java.util.Arrays;

public class merge_two_arr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++)
            nums1[m+i] = nums2[i];
        Arrays.sort(nums1);
        for(int c:nums1)
        {
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        int []x1={1,3,0,0};
        int m=2;
        int []x2={2,5};
        int n=2;
        merge(x1,m,x2,n);

    }
}
