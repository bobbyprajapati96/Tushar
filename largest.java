package unacademy.arrays;

public class largest {
    public static void large(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] a={2,1,3,5,4,6,9,2};
        large(a);
    }
}
