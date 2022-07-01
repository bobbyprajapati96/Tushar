package unacademy.arrays;

public class leaders2 {
    public static void main(String[] args) {
        int arr[]={1, 10,5,3,9};
        int n=arr.length;
        int brr[]=new int[n];
        int largest=Integer.MIN_VALUE;
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
               // System.out.print(arr[i]+" ");
                brr[j++]=arr[i];
            }
        }
        for(j=j-1;j>=0;j--)
        {
            System.out.print(brr[j]+" ");
        }
    }
}
