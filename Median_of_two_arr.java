package gfg;

import java.util.Arrays;

public class Median_of_two_arr {
    public static double findMedian(int [] a,int []b)
    {
        int n=a.length;
        int m=b.length;
        int p=0;
        int max=0;
        int [] mrg=new int[m+n];
        max=Math.max(n,m);
        for(int i=0;i<max;i++)
        {
            if(i<n){
                mrg[p++]=a[i];
            }
            if(i<m) {
                mrg[p++] = b[i];
            }
        }
        Arrays.sort(mrg);
        int x=mrg.length;
        if(x%2!=0)
        {
            int s=(x+1)/2;
            return mrg[s-1];
        }
        else
        {
            int y=x/2;
            double f=(mrg[y-1]+mrg[y])/2.0;
            return f;
        }
    }

    public static void main(String[] args) {
        int []x1={1,3};
        int []x2={2,5};
        double ans=findMedian(x1,x2);
        System.out.println(ans);

    }
}
