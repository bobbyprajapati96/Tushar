package unacademy.arrays;

public class secondlargest {
    public static int seclarge(int []arr){
        int lar=0;
        int slar=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[lar]){
                slar=lar;
                lar=i;
            }
            else if( arr[i]<arr[lar])
            {
                if(slar==-1 ||arr[i]>arr[slar])
                {
                    slar=i;
                }
            }
        }
        return slar;
    }

    public static void main(String[] args) {
        int[] a={2,1,3,5,4,3,6};
       int x= seclarge(a);
        System.out.println(a[x]);
    }
}
