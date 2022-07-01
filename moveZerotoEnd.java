package unacademy.arrays;

public class moveZerotoEnd
{
    public static void main(String[] args) {
        int [] arr={1,0,2,3,9,0,0,5};
        int count = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        }

        while (count < n) {
            arr[count++] = 0;
        }
        for(int c: arr)
        {
            System.out.print(c+" ");
        }
    }
}

