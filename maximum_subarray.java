package unacademy.arrays;
//kadane algo
public class maximum_subarray {
    public static void main(String[] args) {
        int []arr={-2,7,-6,4,1,-3};
       int currsum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           currsum+=arr[i];
           if(currsum<0)
                currsum=0;
           if(currsum>max)
               max=currsum;
       }
        System.out.println(max);
    }
}
