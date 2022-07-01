package Array;

import java.util.HashMap;

public class Subarray {
    public static void sub(int arr[],int n,int sum)
    {
        int currSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            currSum+=arr[i];
            if(currSum-sum==0)
            {
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currSum-sum))
            {
                start=map.get(currSum-sum)+1;
                end=i;
                break;
            }
            map.put(currSum,i);
        }
        if(end==-1)
        {
            System.out.println("Sub Array is not present");
        }
        else
        {
            System.out.println("Sub array fount from : "+ start + " to "+ end);
        }

    }
    public static void main(String[] args) {
        int [] arr={10,22,-5,34,6,9,5};
        int sum=17;
        int n=arr.length;
        sub(arr,n,sum);

    }
}
