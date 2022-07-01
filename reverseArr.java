package practice;

public class reverseArr
{
    public static void rev(int arr[] ,int n)
    {
        int x=Math.floorDiv(n,2);
        for(int i=0;i<x;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,3,8,6};
        int n=arr.length;
        rev(arr,n);
    }
}
