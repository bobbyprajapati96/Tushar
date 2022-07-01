package Array;

public class squareElements {
    public static void square(int arr[]){
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
       for(int i=arr.length-1;i>=0;i--)
       {
           if(arr[left]>arr[right]){
               arr[i]=arr[left];
               left++;
           }
           else
           {
               arr[i]=arr[right];
               right--;
           }
       }
       for(int a:arr)
       {
           System.out.print(a+" ");
       }
    }
    public static void main(String[] args) {
        int arr[]={0,1,4,5,7,8,9};
        square(arr);
    }
}
