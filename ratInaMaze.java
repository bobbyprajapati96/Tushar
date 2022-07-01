package unacademy.arrays;

public class ratInaMaze {
    public static boolean findPath(int arr[][],boolean vis[][],int i,int j)
    {
        int n=arr.length;
        if(i>=n || j>=n || arr[i][j]==0 || vis[i][j] ){
            return false;
        }
        if(i==n-1 && j==n-1)
            return true;
        vis[i][j]=true;
        if(findPath(arr, vis, i+1, j)) return true;
        if(findPath(arr, vis, i, j+1)) return true;
        vis[i][j]=false;
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={
                {1,1,0,1},
                {1,1,1,1},
                {0,0,1,0},
                {1,1,1,1}
        };
        int n=arr.length;
        boolean vis[][]=new boolean[n][n];
        boolean ans=findPath(arr,vis,0,0);
        System.out.println(ans);
    }
}
