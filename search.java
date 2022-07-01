package unacademy.arrays;

public class search {
    public static void search(int[] arr,int t)
    {int count=-1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == t) {
                count = i;
                break;
            }
        }
        if(count==-1)
            System.out.println("Not found");
        else
            System.out.println("found at "+count);
    }
    public static void main(String[] args) {
        int[] a={2,1,3,5,4,3,6};
        int x=8;
        search(a,x);
    }
}
