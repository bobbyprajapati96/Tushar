package Sortings;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={3,2,4,15,5,6};
        int n=arr.length;
        System.out.println("Before Sorting");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        //Bubble Sort
        //Time Complexity = O(n^2)
        // Not so good for competitive programming
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Similarly we can do for Descending Order also just by little change on line 28
//        for(int i=0;i<n-1;i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("\nAfter Sorting");

        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
