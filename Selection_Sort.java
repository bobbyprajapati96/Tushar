package Sortings;

public class Selection_Sort {
    public static void main(String[] args) {
      int [] arr={23,34,5,6,2,53,24};


      //Selection Sort
        // Time Complexity -> O(n^2)
      for(int i=0;i<arr.length;i++)
      {
          int small=i;
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[small]>arr[j])
              {
                  small=j;
              }
          }
          int temp=arr[small];
          arr[small]=arr[i];
          arr[i]=temp;
      }
      for(int a:arr)
      {
          System.out.print(a+" ");
      }
    }
}
