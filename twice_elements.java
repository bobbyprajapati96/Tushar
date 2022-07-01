package Array;

public class twice_elements {
    public static void main(String[] args) {
        int[] arr={2,3,3,5,5,4,4,1,2};
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
