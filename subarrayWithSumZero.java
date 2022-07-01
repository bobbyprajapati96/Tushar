package unacademy.arrays;

import java.util.HashSet;
import java.util.Set;

public class subarrayWithSumZero {
    public static void main(String[] args) {
        int []arr={2,3,1,-4,3,-2};
//        int [] pre=new int[arr.length];
//        pre[0]=arr[0];
        Set<Integer> set=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(set.contains(sum)){
                System.out.println("true "+ sum);
            }
            set.add(sum);
        }
        System.out.println("false");
    }
}
