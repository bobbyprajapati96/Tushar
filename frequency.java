package unacademy.arrays;

import java.util.ArrayList;
import java.util.List;

public class frequency  {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,4,5,6,7,7};
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1]){
                count++;
            }
            else
            {
                System.out.println("Freq of "+arr[i-1]+" is"+ count);
                count=1;
            }

        }
        System.out.println("Frequency of "
                + arr[arr.length - 1]
                + " is: " + count);

    }
}
