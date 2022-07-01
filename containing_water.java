package unacademy.arrays;

public class containing_water {
    public static void main(String[] args) {
        int a[]={1,8,6,2,4,5,8,3,7};
        int maxarea=0;
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            int height=Math.min(a[l],a[r]);
            int dis=r-l;
            int area=height*dis;
            maxarea=Math.max(maxarea,area);
            if(a[l]<a[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(maxarea);
    }



}
