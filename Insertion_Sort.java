package Sortings;

public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr={12,32,4,5,72,53};
        for(int i=1;i< arr.length;i++) {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
