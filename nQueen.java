package unacademy.arrays;

public class nQueen {
    public static boolean isSafe(int arr[][],int n,int row,int col)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]==1) return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--) //checking left diagonal
            if(arr[i][j]==1) return false;
        for(int i=row,j=col;i>=0 && j<n;i--,j++)//checking right diagonal
            if(arr[i][j]==1) return false;
        return true;
    }
    public static boolean check(int arr[][],int n,int row) {
        if (row == n)
            return true;
        for (int col = 0; col < n; col++) {  // going col wise if safe then put queen
            if (isSafe(arr, n, row, col)) {
                arr[row][col] = 1;
                if (check(arr, n, row + 1)) return true;
            }
            arr[row][col] = 0;//otherwise put zero
        }
    return false;
    }
    public static void main(String[] args) {
        int n=4;
        int arr[][]=new int[n][n];
        check(arr,n,0);
        for(int []array:arr)
        {
            for(int e:array)
            {
                System.out.print(e+" ");
            }
            System.out.println();

        }
    }
}
