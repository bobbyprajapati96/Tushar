package unacademy.arrays;

public class delete {
    public static int delete(int[] arr,int x)
    {
        int i=0;
        int n=arr.length;
        for(;i<arr.length;i++)
        {
            if(arr[i]==x) {
                break;
            }
        }
        if(i==n)
            return n;
        for(int j=i;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int key=6;
        int x=delete(arr,key);
        System.out.println(x);
       for(int i=0;i<x;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}
