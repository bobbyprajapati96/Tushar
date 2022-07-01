package unacademy.arrays;

public class leaders {
    public static void main(String[] args) {
        int[] arr={2,7,6,4,1,3,};
        int [] b=new int[arr.length];
        int j=0;
        int lar=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] > lar) {
                lar = arr[i];
//                System.out.print(arr[i]+" ");
                b[j++] = arr[i];
            }
        }
            for(j=j-1;j>=0;j--)
            {
                System.out.print(b[j]+" ");
            }

        }
    }

