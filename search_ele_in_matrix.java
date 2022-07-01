package unacademy.arrays;

public class search_ele_in_matrix {
    static boolean search(int a[][],int key)
    {
        int row=0;
        int col=a.length-1;
        while(row<a.length&& col>=0){
            if(a[row][col]==key)
            {
                return true;
            }
            else if(key>a[row][col])
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]arr= {
                {1, 2, 3,5},
                {4, 5, 6,10},
                {7,8,9,11},
                {8,12,15,18}
        };
        boolean x=search(arr,5);
        System.out.println(x);
    }
}
