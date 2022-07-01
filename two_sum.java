package gfg;

public class two_sum {
    public static int[] twosum(int[] nums,int x)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==x-nums[i])
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int tar=18;
        int [] x=twosum(arr,tar);
        if(x==null)
            System.out.println("Not found");
        else {
            for (int c : x) {
                System.out.print(c + " ");
            }
        }
    }
}
