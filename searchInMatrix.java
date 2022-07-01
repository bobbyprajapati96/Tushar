package unacademy.arrays;

public class searchInMatrix {
    static boolean searchInAMatrix(int a[][], int key) {
        int row = 0;
        int col = a.length-1;

        while(row < a.length && col >= 0) {
            if(a[row][col] == key) {
                return true;
            } else if(key > a[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 35, 4},
                {5, 6, 90}
        };
        int key = 1;
        boolean ans=searchInAMatrix(a,key);
        System.out.println(ans);
    }
}
