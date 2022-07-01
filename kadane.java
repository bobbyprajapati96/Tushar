package unacademy.arrays;

public class kadane {
    public static void main(String[] args) {
        int arr[]= {-2, 7, -6, -4, 1, -3, 8};
        int cursum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cursum=arr[i];
            if(max<cursum)
                max=cursum;
            if(cursum<0)
                cursum=0;
        }
        System.out.println(max);
    }
}
