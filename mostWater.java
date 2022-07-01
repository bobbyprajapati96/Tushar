package unacademy.arrays;

public class mostWater {
    public static void main(String[] args) {
        int a[] = {1, 4, 6, 2, 4, 5, 8, 3, 7};
        int l=0;
        int r=a.length-1;
        int maxArea=0;
        while(l<r){
            int height=Math.min(a[l],a[r]);
            int dis=r-l;
            int area=height*dis;
            maxArea=Math.max(maxArea,area);
            if(a[l]<a[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        System.out.println(maxArea);
    }
}
