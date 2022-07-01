package Array;

import java.util.HashSet;
import java.util.Set;

class zerosum
{
    public static boolean hasZeroSumSubarray(int[] nums)
    {
        // Write your code here...
        Set<Integer> s=new HashSet<Integer>();
        s.add(0);
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
            if(s.contains(sum))
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int [] arr={4, -6, 3, -1, 4, 2, 7 };
        boolean ans=hasZeroSumSubarray(arr);
        System.out.println(ans);
    }
}
