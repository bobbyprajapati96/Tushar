package unacademy.arrays;

public class majorityElement {
    public static void main(String[] args) {
        int arr[]={1,2,23,3,4,4,4,4,4,4,2,1,4,};
        int currEle=-1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                currEle=arr[i];
                count=1;
            }
            else
            {
                if(arr[i]==currEle)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }
        int fcount=0;
        for(int e:arr){
            if(e==currEle)
            {
                fcount++;
            }
        }
        if(fcount>arr.length/2)
            System.out.println(currEle);
        else
            System.out.println("Not found");
    }
}
