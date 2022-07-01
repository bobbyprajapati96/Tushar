package Array;

public class Two_non_repeating {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,2,4};
        int res = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
            temp = res;
        }
        res=(res & -res);
        int n1=0;
        int n2=0;
        for(int i=0;i< arr.length;i++)
        {
           if((arr[i] & res)>0)
                n1=(n1^arr[i]);
           else
                n2=(n2^arr[i]);
        }
        System.out.println(n1+" "+n2);
    }
}
