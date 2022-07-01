package unacademy.arrays;

public class longest_length {
    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,0,1,1,1,1,0};
        int count=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                c=0;
            else
            {
                c++;
                count=Math.max(count,c);
            }
        }
        System.out.println(count);
    }
}
