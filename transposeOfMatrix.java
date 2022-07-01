package unacademy.arrays;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int [][]arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7,8,9}
        };
        int n;
        n = arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;i++)
            {
                int swap=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=swap;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }

}
